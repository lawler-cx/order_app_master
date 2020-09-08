package cn.order.app.domain

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id
import com.google.common.collect.Table
import com.sun.xml.internal.stream.Entity

import scala.beans.BeanProperty


class User {
  var id:Integer = _

  var name:String = _

  var sex:String = _
}
