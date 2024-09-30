package src.main.scala.example_3waytowriteFN

object FunctionComposition {
  def main(args: Array[String]): Unit = {
    var result = multiplyBy2(add2(10)) // Function composition
    println(result)
  }

  def add2(a: Int): Int = {
    a + 2
  }

  def multiplyBy2(a: Int): Int = {
    a * 2
  }

}
