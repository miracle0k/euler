package euler

class P011 {
  def run() {
    var triangularNumber = 0
    var natual = 1
    while (true) {
      triangularNumber = triangularNumber + natual
      if (countDivitor(triangularNumber) >= 500) {
        print(triangularNumber)
        return
      }
      natual = natual + 1
    }
  }
  
  def countDivitor(n: Int) : Int = {
    val end: Int = Math.sqrt(n.toDouble).toInt
    var i = 1
    var count = 0
    while (i < end) {
      if(n % i == 0) {
        count += 2
      }
      i += 1
    }
    // 완전 제곱수
    if (end * end == n) {
      count += 1
    }
    
    return count
  }
}

object P011 extends App {
  new P011().run()
}