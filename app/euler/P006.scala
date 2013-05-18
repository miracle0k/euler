package euler

class P006 {
  private def sumOfSquare(to: Range): Int = {
    val sum = to.foldLeft(0)((x,y) => x + y)
    sum * sum
  }                                               //> sumOfSquare: (to: Range)Int

  private def squareOfSum(to: Range): Int = {
    to.foldLeft(0)((x,y) => x + y * y)
  }
  
  def run(to: Range): Int = {
    sumOfSquare(to) - squareOfSum(to)
  }
}

object Run extends App{
  println(new P006().run(1 to 100))
}