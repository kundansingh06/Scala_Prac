package src.main.scala.example_1loop

import scala.util.control.Breaks._
object Examplebreakable {
  def main(args: Array[String]): Unit = {

    breakable { // Breakable method to avoid exception
      for (i <- 1 to 10) {
        if (i == 5) {
          println("if"+i)
          break
        }
        else {
          println("else"+i)
        }
      }
    }


  }
}
