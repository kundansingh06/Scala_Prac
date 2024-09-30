package src.main.scala.example_3waytowriteFN

object FunctionNamedParameter {
  def main(args: Array[String]): Unit = {
    var result1 = functionExample(a = 15, b = 2)
    var result2 = functionExample(b = 15, a = 2)
    var result3 = functionExample(15, 2)
    println("result1:"+result1+",result2:" +result2+ ",result3"+result3)
  }
  def functionExample(a: Int, b: Int): Int = {
    a + b
  }

}
