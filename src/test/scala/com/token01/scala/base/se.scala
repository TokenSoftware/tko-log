package com.token01.scala.base

/**
  * se
  * 模式匹配
  * @author sun-abel 
  * @create 2018-03-12 下午8:04
  **/
object se {


  def judgeGrade(name: String, grade: String) {
    grade match {
      case "A" => println(name + ", you are excellecnt")
      case "B" => println(name + ", you are good")
      case "C" => println(name + ", you are just so so")
      case _ if name == "Tony" => println(name + ", you are a good boy,come on")
      case _ => println("you need to work harder")
    }
  }

  def matchConstant(x: Any) = x match {
    case 1 => "One"
    case "two" => "Two"
    case "3" => "Three"
    case true => "True"
    case null => "null value"
    case Nil => "empty list"
    case _ => "other value"
  }

  def main(args: Array[String]): Unit = {

    judgeGrade("Monica", "A")
    println(matchConstant(1))

  }
}
