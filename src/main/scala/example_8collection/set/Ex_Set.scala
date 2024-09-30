package src.main.scala.example_8collection.set

import scala.collection.mutable._
//By default set in Scala are immutable.
object Ex_Set {
  def main(args: Array[String]): Unit = {

    //Immutable set
    /*val set1 = Set("aa", "bb", "cc","aa", "bb", "cc")
    println(set1)
    val set2 = Set("aa", "bb", "zz","cc","aa", "bb", "cc")
    println(set2)*/

    //Mutable Set
    var set3 = Set("aa", "bb", "cc")
    println(set3)
    set3 += "Geeks"
    println(set3)
    set3 ++== Set("Geeks12", "geek23", "G")
    var set4 = Set("aa", "bb", "cc")
    set4.add("geeksForgeeks100")
    println(set4)

    // Deleting elements in set
    // using -= and --= methods
    set4 -= "600"
    set4 --= List("300", "100")

    
    //Creating empty sets
    /*val myset1 = Set()
    println(myset1)
    val myset2 = SortedSet(87, 0, 3, 45, 7, 56, 8,6)
    myset2.foreach((items: Int)=> println(items)) */

  }
}