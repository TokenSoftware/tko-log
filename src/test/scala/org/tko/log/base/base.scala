package org.tko.log.base

/**
  * base
  *
  * @author kongMing
  * @create 2018-03-12 下午7:41
  **/
object base {

  case class User(username: String, password: String)

  def main(args: Array[String]): Unit = {
    val u = new User("SUN", "123")
    println(u)
  }
}
