/* P04 (*) Find the number of elements of a list. */

object NumberOfElements {
  val list = List(1, 4, 7, 11, 31);
  
  def numberOfElementsRecursive[A](list: List[A], i: Int= 0):Int = (list, i) match {
    case (h :: Nil, i)       => i+1;
    case (h :: tail, i)      => numberOfElementsRecursive(tail, i+1);
    case _                   => throw new Exception;
  }
  
  def main(args: Array[String]): Unit = {
    println(numberOfElementsRecursive(list));
  }
}