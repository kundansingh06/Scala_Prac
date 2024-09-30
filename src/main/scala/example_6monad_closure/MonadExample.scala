package src.main.scala.example_6monad_closure

object MonadExample {
  def main(args: Array[String]): Unit = {

    var x = Seq("Geeks", "For", "Geeks")

    var y = x.map(_.toUpperCase)
    var z = x.flatMap(_.toUpperCase)

    println(z)

    val list = List(5, 6, 7)
    val f = (i: Int) => List(i - 1, i, i + 1)
    println(list.flatMap(f))
    // prints List(4, 5, 6, 5, 6, 7, 6, 7, 8)

  }
}