package src.main.scala.example_8collection.Array

import scala.collection.mutable.ArrayBuffer


//Use an Array if the length of Array is fixed, and an ArrayBuffer if the length can vary.
object Ex_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    val name = ArrayBuffer[String]()
    name += "GeeksForGeeks"
    name += "gfg"
    name += "Chandan"
    println(name) //ArrayBuffer(GeeksForGeeks, gfg, Chandan)
    name.foreach(println)

    // accessing 1th index element of arraybuffer
    println(name(0))

    //Add single element to the buffer
    name += ("element0")
    println(name)

    //Add two or more elements
    name+= ("element1", "element2", "element3")
    name += "a" += "b"
    name ++= List("c", "d", "e")
    println(name)
    name.append("element4","element5")
    name.append("4")
    name.appendAll(Seq("5", "6"))
    name.clear
    println(name)

    //Deleting ArrayBuffer Elements:
    name-= ("element0")
    println(name)
    name-= ("element1", "element2", "element3")
    name -= "a" -= "b"
    name --= List("c", "d", "e")
    println(name)
    name.remove(0)
    name.remove(1, 3)
    println(name)


  }
}
