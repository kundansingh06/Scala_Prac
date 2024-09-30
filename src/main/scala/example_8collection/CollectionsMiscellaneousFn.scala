package src.main.scala.example_8collection

object CollectionsMiscellaneousFn {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7)

    val result = list.drop(3) //List(4, 5)
    val result2 = list.dropWhile(x=>{x % 3 == 0})
    val result3 = list.filter(x=>{x % 3 == 0})
    val result4 = list.flatMap{x => List(x,x+1)}

    val list2 = List(List(1,2), List(3,4))
    //val result5 = list.flatten

    val result6 = list.fold(0)(_ + _)
    val result7 = list.foldLeft(0)(_ + _)
    val result8 = list.foldRight(0)(_ + _)
    val result9 = list.map(_ * 2)
    val (result10, result11) = list.partition(x=>{x % 3 == 0})

    val result12 = list.reduce(_ + _)
    val result13 = list.scan(0)(_ + _)

    val list3 = List(1, 2, 3, 4)
    val list4 = List("A", "B", "C", "D")
    val result14 = list3 zip list4

    println(result14)
  }
}
