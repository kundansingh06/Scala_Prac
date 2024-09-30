package src.main.scala.example_1loop

//https://www.includehelp.com/scala/type-hierarchy.aspx
object ScalaTypeHierarchy {
  def main(args: Array[String]): Unit = {

    val anyExample: Any = "Glazed Donut"
    val AnyRefExample: AnyRef = "Glazed Donut"
    val AnyValExample: AnyVal = 2.50

    val anySet: Set[Any] = Set(34, "includehelp", true, List(32, 3, 45))
    println("Set is : " + anySet)

    println("Creating a set of type = 'AnyVal' ")
    val anySet2: Set[AnyVal] = Set(true, false, 1, 2, 34, 87694421, 243.623f, 243.62343d, 'i')
    println("Set is : " + anySet2)

    println("Creating a set of type = 'AnyRef' ")
    val anySet3: Set[AnyRef] = Set("includehelp")
    println("Set is : " + anySet3)

    //subtype of all the types. There is no value of this type.
    println("Creating a set of type = 'Nothing' ")
    val anySet4: Set[Nothing] = Set()
    println("Set is : " + anySet4)

    //The type is subtype of reference types (for all subtypes of AnyRef type).
    println("Creating a set of type = 'Null' ")
    val anyRef: List[Null] = List()
    println("Set is : " + anyRef)

  }
}