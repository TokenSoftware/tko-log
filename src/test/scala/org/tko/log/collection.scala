package org.tko.log

/**
  * collection
  * scala 集合操作
  *
  * @author kongMing
  **/
object collection {

  def main(args: Array[String]): Unit = {
    // 最大最小值
    //    max()
    //    maxBy()
    //    filter()
    //    flatten()
//    map()
    var str ="dP4knqw1QAp"
    theLongest(str)
  }

  /**
    * 基础最大最小
    */
  def max(): Unit = {
    val numbers = Seq(11, 2, 5, 1, 6, 3, 9)

    println(numbers.max)
    println(numbers.min)

  }

  case class Book(title: String, pages: Int)

  /**
    * 高级排序
    *
    */
  def maxBy(): Unit = {
    val books = Seq(
      Book("Future of Scala developers", 85),
      Book("Parallel algorithms", 240),
      Book("Object Oriented Programming", 130),
      Book("Mobile Development", 495)
    )

    //Book(Mobile Development,495)
    println(books.maxBy(book => book.pages))
    //Book(Future of Scala developers,85)
    println(books.minBy(book => book.pages))
  }

  def filter(): Unit = {
    val numbers = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var nf = numbers.filter(n => n % 2 == 0)
    println(nf)

  }

  /**
    * 平滑过滤
    */
  def flatten(): Unit = {

    val abcd = Seq('a', 'b', 'c', 'd')
    val efgj = Seq('e', 'f', 'g', 'h')
    val ijkl = Seq('i', 'j', 'k', 'l')
    val mnop = Seq('m', 'n', 'o', 'p')
    val qrst = Seq('q', 'r', 's', 't')
    val uvwx = Seq('u', 'v', 'w', 'x')
    val yz = Seq('y', 'z')


    val alphabet = Seq(abcd, efgj, ijkl, mnop, qrst, uvwx, yz)
    println(alphabet.flatten)
  }


  def Euler(): Unit = {
    val num1 = Seq(1, 2, 3, 4, 5, 6)
    val num2 = Seq(4, 5, 6, 7, 8, 9)

    //List(1, 2, 3)
    // 两个集合不同
    num1.diff(num2)

    //List(4, 5, 6)
    // 两个集合相同
    num1.intersect(num2)

    //List(1, 2, 3, 4, 5, 6, 4, 5, 6, 7, 8, 9)
    // 保留重复排序
    num1.union(num2)

  }

  def map(): Unit = {
    val numbers = Seq(1, 2, 3, 4, 5, 6)


    var mapN = numbers.map(n => n * 2)
    println(mapN)

    val chars = Seq('a', 'b', 'c', 'd')

    //List(A, B, C, D)
    var ma = chars.map(ch => ch.toUpper)

    println(ma)
  }

  def theLongest(s: String): String = {

    s.split("[0-9]").filter(_.exists(ch => ch.isUpper))
      .filter(_.exists(ch => ch.isLower))
      .maxBy(_.length)
  }

  def set(): Unit ={
  }

}
