package src.main.scala.example_3waytowriteFN

object PassingFunctionASParameter {
  def main(args: Array[String]): Unit = {
    val resultAdd= passingFnAsPara(20,10,(x,y)=>x+y);
    println(resultAdd)
    val resultSub= passingFnAsPara(20,10,(x,y)=>x-y);
    println(resultSub)
    val resultMul = passingFnAsPara(20, 10, (x, y) => x*y);
    println(resultMul)
  }
  def passingFnAsPara(x:Int,y:Int,  f:(Int,Int)=>Int): Int = f(x,y);
}
