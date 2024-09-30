package src.main.scala.example_6monad_closure

object ClosureExample {
    val a=25;
    val  add = (x: Int) => {
      x + a;
    }
  def main(args: Array[String]): Unit = {
    println(add(a));
  }

}
