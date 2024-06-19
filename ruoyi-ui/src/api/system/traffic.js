import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listTraffic(query) {
  return request({
    url: '/system/traffic/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getTraffic(id) {
  return request({
    url: '/system/traffic/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addTraffic(data) {
  return request({
    url: '/system/traffic',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateTraffic(data) {
  return request({
    url: '/system/traffic',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delTraffic(id) {
  return request({
    url: '/system/traffic/' + id,
    method: 'delete'
  })
}
