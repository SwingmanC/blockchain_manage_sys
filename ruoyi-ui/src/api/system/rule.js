import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listRule(query) {
  return request({
    url: '/system/rule/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getRule(id) {
  return request({
    url: '/system/rule/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addRule(data) {
  return request({
    url: '/system/rule',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateRule(data) {
  return request({
    url: '/system/rule',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delRule(id) {
  return request({
    url: '/system/rule/' + id,
    method: 'delete'
  })
}
