package src.main.scala.example_1loop

object ForLoop {
  def main(args: Array[String]): Unit = {
    for (a <- 1 to 10) {
            println(a);
    }
    for (i <- 1 to 10 by 2) {
      println(i)
    }
    for (a <- 1 until 10) {
      println(a);
    }
    for (a <- 1 until 10 by 2) {
      println(a);
    }
    for (w <- 0 to 3; z <- 8 until 10) {
      println(w);
      println(z);
    }

    for (a <- 1 to 10 if a % 2 == 0) {
      println(a);
    }

    //Scala for-loop Example by using yield keyword
    var data_yield = for (a <- 1 to 10) yield a
    for (i <- data_yield) {
      println(i)
    }


    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


       for( a <- list){
            println("Author rank is : " +a);
       }

    for (a <- list;if a<6) {
      println("Author rank is : " + a);
    }

    list.foreach{println}
    list.foreach(print)
    list.foreach((element: Int) => print(element + " "))

    println

  }
}