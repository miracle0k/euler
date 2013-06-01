package euler

import org.scalatest._
import org.scalatest.matchers.ShouldMatchers

class LibSpec extends FlatSpec with ShouldMatchers {
  "Libs.isPrime" should "pass 2 then true" in {
    Lib.isPrime(2) should equal(true)
  }
  
  "Libs.isPrime" should "pass 100 then false" in {
    Lib.isPrime(100) should equal(false)
  }
  
  "Libs.isPrime" should "pass 11 then true" in {
    Lib.isPrime(11) should equal(true)
  }
}