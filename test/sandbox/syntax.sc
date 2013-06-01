package sandbox

import euler.Lib

object syntax {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
println(Stream.from(2).filter{BigInt(_).isProbablePrime(8)}(10001-1))
                                                  //> 104743

  
}