package euler

import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

class P007Spec extends FlatSpec with ShouldMatchers {
  "P007" should "n이 1이면 2가 나와야한다"  in {
    val p007 = new P007();
    p007.run(1) should equal (2)
  }
  
  "P007" should "6이 이면 13이  나와야한다"  in {
    val p007 = new P007();
    p007.run(6) should equal (13)
  }
  
  "P007" should "10001이 이면 104743이  나와야한다"  in {
    val p007 = new P007();
    p007.run(10001) should equal (104743)
  }
}