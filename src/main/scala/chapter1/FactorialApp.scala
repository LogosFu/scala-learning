package chapter1

/**
  * Created with IntelliJ IDEA.
  * 试验App
  * @author LogosFu
  * @since 2019-03-12 21:15
  */
object FactorialApp  extends App {

  def factorialFunc(x: BigInt): BigInt = if (x == 0) 1 else x * factorialFunc(x - 1)
  val result = factorialFunc(30)
  println(result)
}
