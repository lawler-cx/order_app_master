package cn.order.app.service

import cn.order.app.domain.User

trait UserService {
  def getUser():List[User]
}
