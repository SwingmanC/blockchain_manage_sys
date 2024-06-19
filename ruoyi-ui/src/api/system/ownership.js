import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listOwnership(query) {
  return request({
    url: '/system/ownership/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getOwnership(id) {
  return request({
    url: '/system/ownership/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addOwnership(data) {
  return request({
    url: '/system/ownership',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateOwnership(data) {
  return request({
    url: '/system/ownership',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delOwnership(id) {
  return request({
    url: '/system/ownership/' + id,
    method: 'delete'
  })
}
