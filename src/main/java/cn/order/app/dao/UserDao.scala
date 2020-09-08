package cn.order.app.dao

import cn.order.app.domain.User
import org.springframework.stereotype.Repository
import org.apache.ibatis.annotations._

import scala.swing.Dialog.Result

@Repository
trait UserDao  {
  @Select("SELECT * FROM users")
  def getUser():List[User]


}
