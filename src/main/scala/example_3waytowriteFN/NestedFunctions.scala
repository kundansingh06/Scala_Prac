package src.main.scala.example_3waytowriteFN

object NestedFunctions {
  def main(args: Array[String]) = {
    var result = add(10, 10, 10)
    println(result)
  }
  def add(a: Int, b: Int, c: Int) = {
    def add2(x: Int, y: Int) = {
      x + y
    }
    add2(a, add2(b, c))
  }
}
