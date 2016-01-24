import scala.util.control.Breaks._

/**
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
object LargestPalindromeProduct {
  def isPalindrome(number: Int): Boolean = {
    var dup = number
    var rev = 0
    while(dup > 0) {
      rev = rev * 10 + dup % 10
      dup = dup / 10
    }
    rev == number
  }

  def main(args: Array[String]) {
    var maxPalindrome = 0
    var j = 0
    var counter = 0
    for{
      i <- 999 to 100 by -1
    } yield {
      if(i % 11 == 0) {
        j = 999
        counter = 1
      } else {
        j = 990
        counter = 11
      }
      breakable {
        while(j >= i){
          val tmp = i * j
          if(tmp < maxPalindrome) break()
          if(isPalindrome(tmp)){
            maxPalindrome = tmp
          }
          j = j - counter
        }
      }
    }
    print(maxPalindrome)
  }
}
