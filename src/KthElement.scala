/* P03 (*) Find the Kth element of a list. */

object KthElement {
  val list = List(1, 5, 7, 11)
  
  def kthElement[A](list: List[A], k: Int): A = ( list, k ) match {
    case (h :: tail, k) if k == 0  => h;
    case (h :: tail, k) if k > 0   => kthElement(tail, k-1);
    case _                         => throw new NoSuchElementException; 
  }
  
  def main(args: Array[String]): Unit = {
    println(kthElement(list, 0));
  }
}