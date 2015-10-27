/* P06 (*) Find out whether a list is a palindrome. */

object IsPalindrome {
  val list1 = List(1, 4, 7, 11)
  val list2 = List(1, 2, 3, 2, 1)
  val list3 = List(1, 2, 2, 6, 6, 2, 2, 1)
  
  def isPalindromeRecursive[A](list: List[A]):Boolean = {
    def recursive(i: Int, j: Int):Boolean = {
      if (j<=i) true
      else if (list(i)==list(j)) recursive(i+1,j-1)
      else false
    }
    recursive(0, list.length-1)
  }
  
  def isPalindromeRecursive2[A](list: List[A]):Boolean = list == list.reverse
  
  
  def main(args: Array[String]): Unit = {
    println(isPalindromeRecursive(list1))
    println(isPalindromeRecursive(list2))
    println(isPalindromeRecursive2(list3))
  }
}