/*
  Find Longest span sum of 2 binary Arrays of size n
 */
object LongestSpanSumBinary {
  def findLongestSpanSum(a: Seq[Int], b: Seq[Int]): Int = {
    val n = Seq(a.length, b.length).min
    var maxLen = 0
    for {
      i: Int <- 0 until n by 1
    } yield {
      var sumA = 0
      var sumB = 0
      for {
        j: Int <- i until n by 1
      } yield {
        sumA += a(j)
        sumB += b(j)
        if(sumA == sumB) {
          val len = j - i + 1
          if(len > maxLen)
            maxLen = len
        }
      }
    }
    maxLen
  }

  def main(args: Array[String]) {
    val maxLen = findLongestSpanSum(Seq(0,0,1,0,1), Seq(1,0,0,1))
    println(maxLen)
  }
}
