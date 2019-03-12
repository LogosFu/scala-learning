package chapter1

/**
  * Created with IntelliJ IDEA.
  *
  * @author LogosFu
  * @since 2019-03-11 20:58
  */
object FactorialObj {

  def factorialFunc(x: BigInt): BigInt = if (x == 0) 1 else x * factorialFunc(x - 1)

  def main(args: Array[String]): Unit = {
    val result = factorialFunc(30)
    println(result)
  }
}
