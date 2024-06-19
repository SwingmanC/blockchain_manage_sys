import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listSum(query) {
  return request({
    url: '/system/sum/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getSum(id) {
  return request({
    url: '/system/sum/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addSum(data) {
  return request({
    url: '/system/sum',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateSum(data) {
  return request({
    url: '/system/sum',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delSum(id) {
  return request({
    url: '/system/sum/' + id,
    method: 'delete'
  })
}
