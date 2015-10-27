/* P09 (**) Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements they should be placed in separate sublists.
Example:

scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)) */

object ConsecutiveDuplicatesIntoSublists {
  
  def pack[A](ls: List[A]): List[List[A]] =
    ls.foldRight(List[List[A]]()) { (h, r) =>
      if (r.isEmpty || r.head.head != h) List(h) :: r
      else (h :: r.head) :: r.drop(1)
    }                                             //> pack: [A](ls: List[A])List[List[A]]
  
  
  def main(args: Array[String]): Unit = {
    println(pack(List(1,1,1,1,3,3,3,4,4,4,4,5)))
  }
}