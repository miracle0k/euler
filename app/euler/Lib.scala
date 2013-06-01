package euler

object Lib {
  def isPrime(n: Int) : Boolean = {
    if (n == 2) {
      return true
    }
    
    if (n % 2 == 0) {
      return false
    }
    
    for(wptn <- 3 until(n,2)) {
      if (n % wptn == 0) {
        return false
      } 
    }
    
    return true
  }
}