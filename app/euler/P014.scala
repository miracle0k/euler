package euler

object P014 extends App {
  def run(n : Long, cnt: Int = 0) : Int = {
    n match {
      case number if number < 1 => throw new IllegalArgumentException("n은 음수가 될 수 없다." + n)
      case 1 => cnt + 1
      case number if number % 2 == 0 => run(number/2, cnt + 1)
      case _ => run(3*n + 1, cnt + 1)
    }
  }
  
  val range = 1 to 1000000
  //val range = 1 to 100

  val r = range.foldLeft((1, 0))((b, a) => {
    val cnt = run(a)
    if (b._2 < cnt) {
      (a, cnt)
    } else {
      b
    }
  })
  
  print(r)
}