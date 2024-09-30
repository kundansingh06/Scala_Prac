package src.main.scala.example_8collection.LIST_LISTBUFFER

object Ex_ListBuffer {
  def main(args: Array[String]): Unit = {

    val mylist = List("Geeks", "GFG", "GeeksforGeeks", "Geek123")
    val emptylist = List()
    println(mylist)
    val mylist2 = List("C", "C#", "Java", "Scala", "Java", "Scala", 10, "PHP", "Ruby")
    println(mylist2)
    println(mylist.head)
    println(mylist.tail)
    println(mylist.isEmpty)
    println(mylist.reverse)

    
    println(emptylist)
    val p0 = emptylist.+("10")
    println(p0)
    val p1: IndexedSeq[Any] = "Julia" :+ emptylist
    println(p1)
    //use element and lists with ::
    val p2 = "Julia" :: emptylist
    println(p2)
    //use two or more lists with ::: operator
    val p3 = emptylist ::: p2
    println(p3)
    
    
    


    
    val string1 = List.fill(3)("Scala") //string1 : List(Scala, Scala, Scala)
    val number = List.fill(8)(4) //number : List(4, 4, 4, 4, 4, 4, 4, 4)
    
    
    
    /*var name = new ListBuffer[String]()
    //Adding one element
    name += "GeeksForGeeks"
    //Add two or more elements
    name += ("gfg", "class")
    //Adding one or more element using append method
    name.append("Scala", "Article")
    //Append a sequence of elements to the list buffer
    name ++= Seq("a", "b", "c")
    //Insert an element at a specific index
    name.insert(2, "bb")
    //Update an element at a specific index
    name.update(1, "aa")
    //Convert the list buffer to an immutable list
    val list = name.toList
    //Printing ListBuffer
    println(name)
    println(name(1))
    //Deletes one element
    name -= "GeeksForGeeks"
    //Deletes two or more elements
    name -= ("gfg", "class")
    //Printing resultant ListBuffer
    println(name)
    //Removing 0th index element
    name.remove(0)
    //Removing 1th to 3rd index element
    name.remove(1, 3)*/
    
  }
}