package src.main.scala.example_3waytowriteFN

object AnnoymaousFxn {
  def main(args: Array[String]): Unit = {
    val sum=(x: Int, y: Int,z:Int) => x + y + z

    val f=sum(10,20,_:Int)
    val f2=sum(10,_:Int,_:Int)

    println(sum(1,2,3))
    println(f(10))
    println(f2(10,10))
  }

}
