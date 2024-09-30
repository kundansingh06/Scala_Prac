package src.main.scala.example_5caseClass_applyUnapply

case class Emp(name: String)

object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    val e = Emp("Rohan")
    val e1 = Emp("Rohan")
    println(e.name)
    println(e == e1)
    
    val name2 = e.copy()
    println(e.name)
    println(e == name2)
    
    val name3 = e.name.toString
    println(name3)
    

   //e.name = "Orange"  // This will throw an error
    
    
/*apply
unapply
accessor methods are created for each constructor parameter
copy
equals and hashCode
toString*/
    
    def describeEMP(e: Emp): String = e match {
    case Emp("ram") => "ram is good"
    case Emp("mohan") => "mohan is nice"
    case _ => "Some other person"
}
    
  }
}