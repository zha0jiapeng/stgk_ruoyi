import request from '@/utils/request'

// 查询电缆列表
export function listCable(query) {
  return request({
    url: '/system/cable/list',
    method: 'get',
    params: query
  })
}

// 查询电缆详细
export function getCable(id) {
  return request({
    url: '/system/cable/' + id,
    method: 'get'
  })
}

// 新增电缆
export function addCable(data) {
  return request({
    url: '/system/cable',
    method: 'post',
    data: data
  })
}

// 修改电缆
export function updateCable(data) {
  return request({
    url: '/system/cable',
    method: 'put',
    data: data
  })
}

// 删除电缆
export function delCable(id) {
  return request({
    url: '/system/cable/' + id,
    method: 'delete'
  })
}
