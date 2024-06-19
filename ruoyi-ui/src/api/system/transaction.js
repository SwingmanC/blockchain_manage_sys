import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listTransaction(query) {
  return request({
    url: '/system/transaction/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getTransaction(id) {
  return request({
    url: '/system/transaction/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addTransaction(data) {
  return request({
    url: '/system/transaction',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateTransaction(data) {
  return request({
    url: '/system/transaction',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delTransaction(id) {
  return request({
    url: '/system/transaction/' + id,
    method: 'delete'
  })
}
