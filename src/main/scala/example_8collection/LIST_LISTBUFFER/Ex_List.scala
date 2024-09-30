package src.main.scala.example_8collection.LIST_LISTBUFFER

object Ex_List {
  def main(args: Array[String]): Unit = {
    val s1: List[String] = List("apples", "oranges", "pears") // List of Strings

    val n1: List[Int] = List(1, 2, 3, 4) // List of Integers
    val n2: List[Int] = List(10, 20, 30, 40) // List of Integers

    val e: List[Nothing] = List() // Empty List.

    val listrange = List.range(0, 10, 2)

    val list_fill = List.fill(3)("foo")

    val listadd = s1 :+ "Mango" //add element
    val listadd2 = "Julia" :: s1 //add element

    val a = List(1, 2, 3)
    val b = List(4, 5, 6)
    val c = List.concat(a, b)

    println(s1)
    println(listadd)
    println(listadd2)

    n1.foreach((element: Int) => println(element)) // Iterating using foreach loop
    println("-----1---------")
    println(n1(2)) // Accessing element of 2 index
    println("-----2---------")
    var merge1 = n1 ++ n2 // Merging two list
    var merge2 = n1 ::: n2 // Merging two list

    merge1.foreach((element: Int) => println(element + " "))
    merge2.foreach((element: Int) => println(element + " "))
    println("------3--------")
    var n4 = merge1.sorted // Sorting list
    n4.foreach((element: Int) => println(element + " "))
    println("-------4-------")
    var list5 = merge1.reverse // Reversing list elements
    list5.foreach((element: Int) => println(element + " "))

  }
}