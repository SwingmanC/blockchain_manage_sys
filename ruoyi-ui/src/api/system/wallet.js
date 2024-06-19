import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listWallet(query) {
  return request({
    url: '/system/wallet/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getWallet(id) {
  return request({
    url: '/system/wallet/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addWallet(data) {
  return request({
    url: '/system/wallet',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateWallet(data) {
  return request({
    url: '/system/wallet',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delWallet(id) {
  return request({
    url: '/system/wallet/' + id,
    method: 'delete'
  })
}
