package src.main.scala.example_8collection.tupple

object Ex_Tupple {
  def main(args: Array[String]): Unit = {
    val t = (1, "hello",1,"hello")
    println("t" + t)
    val t2 = new Tuple3(1, "hello", Console)
    println("t2" + t2)

    val sum = t._1 + t._2 + t._3+t._4
    println("sum" + sum)

    t.productIterator.foreach { i => println("Value = " + i) }

    println("Concatenated String: " + t.toString())
    val t3 = new Tuple2("Scala", "hello")
    println("Swapped Tuple: " + t3.swap)

  }
}