package src.main.scala.example_8collection.range_seq_iterator

object Ex_Ranges {
  def main(args: Array[String]): Unit = {
    //By using "to" keyword
    var R1 = 3 to 10
    //By using "until" keyword
    val R2 = 3 until 7
    //By using "to and by" keyword
    var R3 = 3 to 11 by 2


    val listFrom1To5 = (1 to 5).toList
    val setFrom1To5 = (1 to 5).toSet
    val sequenceFrom1To5 = (1 to 5).toSeq
    val arrayFrom1To5 = (1 to 5).toArray

    arrayFrom1To5.foreach(print(_))

    //By using "range" keyword
    var R4 = Range(3, 45, 4)
    var var_name2 = Array.range(0, 10)

  }
}