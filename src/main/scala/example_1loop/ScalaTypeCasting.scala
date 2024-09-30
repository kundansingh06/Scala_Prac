package src.main.scala.example_1loop

object ScalaTypeCasting {
  def main(args: Array[String]): Unit = {
/*
Character -> Integer
Short -> Integer
Byte -> Integer
Integer -> Long
Long -> Float
Float -> Double*/

    //1.Implicit type casting
    val a: Int = 3421
    println("a has value: " + a + " and its type is: " + a.getClass)
    val b = a / 4 // result is 855.25 but will be converted to Int
    println("The value of a/4: " + b + " and its type is: " + b.getClass)

    //2.Explicit Type Conversion
    // Type conversion from Short to Long
    val c: Short = 3421
    println("c has value: " + c + " and its type is: " + c.getClass)
    val d: Long = c // converting type from short to long
    println("Type casting from Short to Long")
    println("d has value: " + d + " and its type is: " + d.getClass)
    // Type conversion from Char to Float
    val ch: Char = 'S'
    println("\nch has value: " + ch + " and its type is: " + ch.getClass)
    val fl: Float = ch // converting type from Char to Float
    println("Type casting from Character to Float")
    println("fl has value: " + fl + " and its type is: " + fl.getClass)

  }
}