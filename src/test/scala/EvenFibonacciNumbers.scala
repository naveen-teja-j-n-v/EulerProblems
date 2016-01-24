/**
 * Question: In the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
object EvenFibonacciNumbers {
  def main (args: Array[String]) {
    val limit = 4 * math.pow(10, 6).toInt
    var sum = 0
    var prev = 1
    var current = 1
    while(current < limit){
      val temp = current
      current = prev + current
      prev = temp
      if(current % 2 == 0){
        sum += current
      }
    }
    println(sum)
  }
}
