/*
  Find Sub Array with least average. Array size n & subArray size k
 */
object SubArrayLeastAvg {
  def findSubArray(a: Seq[Int], k: Int) = {
    var startIndex = -1
    val n = a.length
    if(n > k) {
      var minSum = 0
      for { i <- 0 until k by 1 } yield minSum += a(i)
      var temp = minSum
      startIndex = 0
      for {i <- k until n by 1} yield {
        temp = temp - a(i - k) + a(k)
        if(temp < minSum) {
          minSum = temp
          startIndex = i - k + 1
        }
      }

    }
    startIndex
  }
  def main(args: Array[String]) {
    val startIndex = findSubArray(Seq(3, 7, 90, 20, 10, 50, 40), 3)
    println(s"[Start, end] = [$startIndex, ${startIndex + 2}]")
  }
}
