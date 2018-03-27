package org.tko.log

/**
  * structures
  *
  * @author kongMing
  * @create 2018-03-12 下午4:50
  **/
object structures {

  def main(args: Array[String]): Unit = {
    val s = List("a", "d", "F", "B", "e")
    // data structures working with
    val n = List(3, 7, 2, 1, 5)

    val a = Array(2,6,1,9,3,2,1,-23)

    val m = Map(
      -2 -> 5,
      2 -> 6,
      5 -> 9,
      1 -> 2,
      0 -> -16,
      -1 -> -4
    )
    // scala list sortwith
    scala.util.Sorting.quickSort(a)

    println(a.mkString(","))

    println(s.sorted)
    println(n.sorted)
  }

}
