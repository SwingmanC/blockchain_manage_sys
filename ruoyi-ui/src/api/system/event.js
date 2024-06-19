import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listEvent(query) {
  return request({
    url: '/system/event/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getEvent(id) {
  return request({
    url: '/system/event/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addEvent(data) {
  return request({
    url: '/system/event',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateEvent(data) {
  return request({
    url: '/system/event',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delEvent(id) {
  return request({
    url: '/system/event/' + id,
    method: 'delete'
  })
}
