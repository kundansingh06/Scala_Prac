package src.main.scala.example_8collection.option

object Ex_Option {
  def main(args: Array[String]): Unit = {
    val m = Map("France" -> "Paris", "Japan" -> "Tokyo")
    println(m.get("France"))
    println(m.get("India"))
    
    val a: Option[Int] = Some(5)
    val b: Option[Int] = None

    println("a.getOrElse(0): " + a.getOrElse(0))
    println("b.getOrElse(10): " + b.getOrElse(10))
  }
}