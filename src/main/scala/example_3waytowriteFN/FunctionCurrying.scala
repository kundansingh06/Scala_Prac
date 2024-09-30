package src.main.scala.example_3waytowriteFN

object FunctionCurrying {
  def main(args: Array[String]) = {
    var result = add(10)(20)
    println(result)

    var addIt = add(10) _
    var result2 = addIt(3)
    println(result2)

  }

  def add(a: Int)(b: Int) = {
    a + b
  }

}
