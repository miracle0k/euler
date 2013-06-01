package euler

class P008 {
  def run(seq:Seq[Char], max:Int=Int.MinValue, count:Int=0, product:Int=1): Int = {
    if(seq.isEmpty) {
      return max
    }

    if(count < 4) {
      run(seq.tail, max, count+1, product*seq.head.asDigit)
    } else {
      run(seq.tail, product.max(max), 0, 1)
    }
  }
}