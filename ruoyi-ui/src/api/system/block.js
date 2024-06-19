import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listBlock(query) {
  return request({
    url: '/system/block/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getBlock(id) {
  return request({
    url: '/system/block/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addBlock(data) {
  return request({
    url: '/system/block',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateBlock(data) {
  return request({
    url: '/system/block',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delBlock(id) {
  return request({
    url: '/system/block/' + id,
    method: 'delete'
  })
}
