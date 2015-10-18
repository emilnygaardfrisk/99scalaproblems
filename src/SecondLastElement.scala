/* P02 (*) Find the last but one element of a list. */

object SecondLastElement {
  val list = List(1, 25, 3, 11);
  
  def secondLastRecursive[A](list: List[A]):A = list match{
    case h :: tail :: Nil => h;
    case h :: tail        => secondLastRecursive(tail); 
    case _                => throw new NoSuchElementException;
  }
  
  def main(args: Array[String]): Unit = {
    println(secondLastRecursive(list));
  }
}