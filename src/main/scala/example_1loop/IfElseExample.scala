package src.main.scala.example_1loop

object IfElseExample {
  def main(args: Array[String]): Unit = {
    val x=20;
    var res=""

    if(x==20) {
      println("20")
    }
    else {
    println("not 20")
     }

    if (x == 20) {
      res="value is 20"
    }
    else {
      res="value is not 20"
    }
    println(res)

    val res2=if(x==20) "Kundan" else "singh";

    println(res2)



  }
}
