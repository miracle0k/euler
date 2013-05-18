package euler

import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

class P006Spec extends FlatSpec with ShouldMatchers {
	"P006" should "1 부터 10까지 실행하면 2640이 나와야한다" in {
	  val p006 = new P006();
	  p006.run(1 to 10) should equal (2640)
	}
}