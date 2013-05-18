package euler
import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

class P005Spec  extends FlatSpec with ShouldMatchers {
  "문제 5" should "1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다." in {
    val p005 = new P005();
    p005.run(1 to 10) should equal(2520)
  }
  
  "문제 5" should "1~20 사이의 어떤 수로도 나누어 떨어지는 가장 작은수는 232792560입니다." in {
    val p005 = new P005();
    p005.run(1 to 20) should equal(232792560)
  }
  
  "lcm" should "2,4의 최소 공배수는 4이다" in {
    val p005 = new P005();
    p005.lcm(2, 4) should equal(4)
  }
}