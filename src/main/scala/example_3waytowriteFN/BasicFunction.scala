package src.main.scala.example_3waytowriteFN

//https://allaboutscala.com/tutorials/chapter-3-beginner-tutorial-using-functions-scala/

object BasicFunction  {

  def main(args: Array[String]): Unit = {
    println(add1(5,4))
    println(add2(5,4))
    println(add3(5,4))
    println(add4(5,4))
    println(add5(5,4))
    println(add6(5,4))
   }


  def add1(x:Int,y:Int):Int={
    return x+y
  }
    //by default last line consider return

  def add2(x: Int, y: Int): Int = {
       x+y
    }

  def add3(x: Int, y: Int): Int = return x + y

  def add4(x: Int, y: Int): Int = x + y

  def add5(x: Int, y: Int) = x + y

  val  add6 = (x: Int, y: Int) => x + y


}