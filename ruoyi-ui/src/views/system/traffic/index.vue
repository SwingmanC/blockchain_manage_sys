<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="请求日期" prop="reqTime">
        <el-date-picker clearable
          v-model="queryParams.reqTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="请选择请求日期">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="目的地址" prop="url">
        <el-input
          v-model="queryParams.url"
          placeholder="请输入目的地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="源地址" prop="referrer">
        <el-input
          v-model="queryParams.referrer"
          placeholder="请输入源地址"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="目标IP" prop="ipAddress">
        <el-input
          v-model="queryParams.ipAddress"
          placeholder="请输入目标IP"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="请求方法" prop="method">
        <el-input
          v-model="queryParams.method"
          placeholder="请输入请求方法"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="响应码" prop="responseCode">
        <el-input
          v-model="queryParams.responseCode"
          placeholder="请输入响应码"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
<!--      <el-form-item label="数据块大小" prop="responseSize">-->
<!--        <el-input-->
<!--          v-model="queryParams.responseSize"-->
<!--          placeholder="请输入数据块大小"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
      <el-form-item label="用户ID" prop="userId">
        <el-input
          v-model="queryParams.userId"
          placeholder="请输入用户ID"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:traffic:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:traffic:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:traffic:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:traffic:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="trafficList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="流量ID" align="center" prop="id" />
      <el-table-column label="请求日期" align="center" prop="reqTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.reqTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="目的地址" align="center" prop="url" />
      <el-table-column label="源地址" align="center" prop="referrer" />
      <el-table-column label="代理信息" align="center" prop="userAgent" />
      <el-table-column label="目标IP" align="center" prop="ipAddress" />
      <el-table-column label="请求方法" align="center" prop="method" />
      <el-table-column label="响应状态码" align="center" prop="responseCode" />
      <el-table-column label="响应数据块大小" align="center" prop="responseSize" />
      <el-table-column label="用户ID" align="center" prop="userId" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:traffic:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:traffic:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改【请填写功能名称】对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="请求日期" prop="reqTime">
          <el-date-picker clearable
            v-model="form.reqTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="请选择请求日期">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="目的地址" prop="url">
          <el-input v-model="form.url" placeholder="请输入目的地址" />
        </el-form-item>
        <el-form-item label="源地址" prop="referrer">
          <el-input v-model="form.referrer" placeholder="请输入源地址" />
        </el-form-item>
        <el-form-item label="代理信息" prop="userAgent">
          <el-input v-model="form.userAgent" type="textarea" placeholder="请输入代理信息" />
        </el-form-item>
        <el-form-item label="目标IP" prop="ipAddress">
          <el-input v-model="form.ipAddress" placeholder="请输入目标IP" />
        </el-form-item>
        <el-form-item label="请求方法" prop="method">
          <el-input v-model="form.method" placeholder="请输入请求方法" />
        </el-form-item>
        <el-form-item label="响应状态码" prop="responseCode">
          <el-input v-model="form.responseCode" placeholder="请输入响应状态码" />
        </el-form-item>
        <el-form-item label="响应数据块大小" prop="responseSize">
          <el-input v-model="form.responseSize" placeholder="请输入响应数据块大小" />
        </el-form-item>
        <el-form-item label="用户ID" prop="userId">
          <el-input v-model="form.userId" placeholder="请输入用户ID" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listTraffic, getTraffic, delTraffic, addTraffic, updateTraffic } from "@/api/system/traffic";

export default {
  name: "Traffic",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 【请填写功能名称】表格数据
      trafficList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        reqTime: null,
        url: null,
        referrer: null,
        userAgent: null,
        ipAddress: null,
        method: null,
        responseCode: null,
        responseSize: null,
        userId: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询【请填写功能名称】列表 */
    getList() {
      this.loading = true;
      listTraffic(this.queryParams).then(response => {
        this.trafficList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        reqTime: null,
        url: null,
        referrer: null,
        userAgent: null,
        ipAddress: null,
        method: null,
        responseCode: null,
        responseSize: null,
        userId: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加流量明细";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getTraffic(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改流量明细";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateTraffic(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addTraffic(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除流量编号为"' + ids + '"的数据项？').then(function() {
        return delTraffic(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/traffic/export', {
        ...this.queryParams
      }, `traffic_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
