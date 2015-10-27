/* P07 (**) Flatten a nested list structure. */

import scala.collection.mutable.ListBuffer

object FlattenNestedListStructure {
  def flatten[A](lists: List[A]*): List[A] = {
    var result = new ListBuffer[A]()
    for (list <- lists)
      result ++= list
    result.toList
  }
  def flatten2(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten2(ms)
    case e           => List(e)
  }

  def main(args: Array[String]): Unit = {
    println(flatten2(List(2,25, 3, List(2,4,5))))
  }
}