package src.main.scala.example_3waytowriteFN

object FunctionDefaultParameter {
  def main(args: Array[String]): Unit = {
    var result1 = functionExample(15, 2)
    var result2 = functionExample(15)
    var result3 = functionExample()
    println("result1:"+result1+",result2:"+result2+",result3:"+result3)
  }

  def functionExample(a: Int = 0, b: Int = 0): Int = {
    a + b
  }


}

