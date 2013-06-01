package euler

class P007 {
  def run(n :Int): Int = {
    var count = 0
    var i = 2
    while(true) {
      if (Lib.isPrime(i)) {
        count += 1
        if (count == n)
          return i
      }
      i += 1
    }
    
    0
  }
}