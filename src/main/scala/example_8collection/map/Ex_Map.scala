package src.main.scala.example_8collection.map

object Ex_Map {
  def main(args: Array[String]): Unit = {

    var mapIm = Map("Ajay" -> 30, "Bhavesh" -> 20, "Charlie" -> 50)
    //Accessing score of Ajay
    val ajay = mapIm("Ajay")
    println(ajay)

    /*//Updating
    mapIm("Ajay") = 10
    println(mapIm) */

    val map = scala.collection.mutable.Map("Ajay" -> 30, "Bhavesh" -> 20, "Charlie" -> 50)
    println("Before Updating: " + map)
    // Updating
    map("Ajay") = 10
    println("Before Updating: " + map)

    // Deleting key-value pairs with  for "Ajay" and "Charlie"
    map -= ("Ajay", "Charlie")
    println("After deleting: " + map)

    val ajay2 = if (mapIm.contains("Ajay2")) mapIm("Ajay2") else 0
    println(ajay2)
    // (k, v) is a tuple with two elements
    for ((k, v) <- map) {
      //where k is key and v is value
      print(k,v)
    }

    val mapMut2 = scala.collection.mutable.Map[String, Int]()
    println("Empty Map: " + mapMut2)
    //Adding new entry
    mapMut2 += ("Charlie" -> 50)
    val c = mapMut2.-("Geeta") 
    println( "The new Map returns: " + c) 
    //using 'get' as a method 
    val x = mapMut2.get("Rahul")
    val x2 = mapMut2.iterator 
    

    val group1 = Map("Nidhi" -> 23, "Rahul" -> 18)
    val group2 = Map("Geeta" -> 22, "Rahul" -> 18)
    //using ++ as a method
    val concatenate = group1.++(group2)
    //Displays concatenated map
    println("Concatenation is: " + concatenate)

  }

}