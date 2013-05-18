package euler
/*
 * 1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
 * 그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
 */

class P005 {
	def run(range : Range) : Int = {
	  range.foldLeft(1)((x, y) => lcm(BigInt(x),BigInt(y)).toInt)
	}
	
	def lcm(x : BigInt, y : BigInt) = {
	  (x * y) / x.gcd(y)
	}
}