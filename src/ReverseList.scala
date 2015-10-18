/* P05 (*) Reverse a list. */

object ReverseList {
  val list = List(1, 4, 7, 11);
  
  def reverseListRecursive[A](list: List[A], reverseList: List[A] = List()):List[A] = list match {
    case Nil      => reverseList
    case h :: tail      => reverseListRecursive(tail, h :: reverseList);
    case _              => throw new Exception;
  }
  
  def main(args: Array[String]): Unit = {
    println(reverseListRecursive(list))
  }
}