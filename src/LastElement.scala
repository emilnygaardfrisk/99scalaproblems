/* P01 (*) Find the last element of a list. */

object LastElement {
  val list = List(1, 4, 7, 11);
  
  def lastRecursive[A](list: List[A]): A = list match {
    case h :: Nil   => h
    case _ :: tail  => lastRecursive(tail)
    case _          => throw new NoSuchElementException
  }
  
  def main(args: Array[String]): Unit = {
    println(lastRecursive(list));
  }
}