/**
 * What is the largest prime factor of the number 600851475143 ?
 */
object LargestPrimeFactor {
  def main(args: Array[String]): Unit = {
    val number: Long = 600851475143L
    var dup: Long = number
    var largestPrimeFactor: Long = 0L
    var divisor: Int = 2
    while(divisor * divisor < dup){
      if (dup % divisor == 0){
        dup = dup / divisor
        largestPrimeFactor = divisor
      } else {
        divisor = if(divisor == 2) 3 else divisor + 2
      }
    }
    if(dup > largestPrimeFactor){
      largestPrimeFactor = dup
    }
    println(largestPrimeFactor)
  }
}
