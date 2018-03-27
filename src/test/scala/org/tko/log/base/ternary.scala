package org.tko.log.base

import scala.collection.mutable

/**
  * ternary
  *
  * @author kongMing
  * @create 2018-03-12 下午7:24
  **/
object ternary {

  def main(args: Array[String]): Unit = {

    //    ternaryR()
    //    placeholder()
    hashMap()

  }

  /**
    * 三目运算
    */
  def ternaryR(): Unit = {
    val i = 10
    val j = if (i > 5) i else 5
    println(j)
  }


  /**
    * 占位符
    */
  def placeholder(): Unit = {
    val list = Array(1, 2, 3, 4, 5)
    var l = list.map(_ * 2).foreach(println)
    //    println(l)
  }

  def hashMap(): Unit = {
    var h = new mutable.HashMap[String, Int]()
    h += ("computer" -> 88)
    h += ("math" -> 90, "english" -> 85, "chinese" -> 80)
    println(h)
  }

}
