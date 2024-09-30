package src.main.scala.example_8collection.Array

import scala.Array._
object Ex_Array {
  def main(args: Array[String]): Unit = {
    val array = Array("example_6monad_closure", "b", "c",  "d", "example_6monad_closure", "b", "e" ,100)
    var array3 = new Array[Int](4)

    //Accessing array element
    println(array(1))

    //Updating an element
    array(1)="employee"

    //Print an element
    println(array(1) )
    
    for ( m1 <-array ) {
            print(m1 +",") 
        } 

    val b = array3:+27

/*:+	append 1 item	old_array :+ e
  ++	append N item	old_array ++ new_array
  +:	prepend 1 item	e +: old_array
  ++:	prepend N items	new_array ++: old_array*/
    var arr1 = Array(1, 2, 3, 4) 
    var arr2 = Array(5, 6, 7, 8) 
    var arr3 = concat( arr1, arr2) 
    
    var array1 = range(1, 15)
    var array2 = range(1, 15, 3)
    val arr: Array[Int] = Array.range(1, 10, 2)

  }
}