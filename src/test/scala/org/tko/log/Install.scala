package org.tko.log

import scala.beans.BeanProperty

/**
  * Install
  *
  * @author kongMing
  **/

case class Install (var de : String)   {

  @BeanProperty
  var cid: String = _

  @BeanProperty
  var channelid: String = "_default_"


  def this() = {
    this("")
    cid = "-1"
    channelid = "_default_"
  }
}

object test{

  def main(args: Array[String]): Unit = {
    val p1 = new Install("de").channelid // Primary constructor
    val p2 = new Install("Fred").cid // First auxiliary constructor

    println(p1)
    println(p2)
  }
}
