/* P08 (**) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
Example:

scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e) */

object EliminateConsecutiveDuplicates {
  def eliminate[A](ls: List[A]): List[A] =
    ls.foldRight(List[A]()) { (h, r) =>
      if (r.isEmpty || r.head != h) h :: r
      else r
    } //> eliminate: [A](ls: List[A])List[A]

  def main(args: Array[String]): Unit = {
    println(eliminate(List(1,1,1,3,4,5,6,7,7,7,7,6,5,4,90)))
  }
}