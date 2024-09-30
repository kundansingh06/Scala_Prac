package src.main.scala.example_1loop

object Unit_Example {

  def printval1(a: String): Unit = {
    println("Hello1 " + a)
  }

  def printval2(a: String) = {
    println("Hello2 " + a)
  }
  def printval3(a: String) {
    println("Hello3 " + a)
  }

  def main(args: Array[String]) {
    val a1 = printval1("i am good1")
    println(a1)  //()
    val a2 = printval2("i am good2")
    println(a2)  //()
    val a3 = printval3("i am good3")
    println(a3)

  }
}
