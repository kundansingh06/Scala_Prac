package src.main.scala.example_2patternMatching

object PatternMatchingExample {
  def main(args: Array[String]): Unit = {
    var a = 10;
    var b="b";

    a match {
      case 2 => println(200)
      case 6 => println(600)
      case 8 => println(800)
      case _ => println("default "+a)
    }

    var result = b match {
      case "a" => println("a")
      case "b" => println("b")
      case _ => println("default")
    }
    var search2 = search("Hello")
    print(search2)
  }


    def search(a: Any): Any = a match {
      case 1 => println("One")
      case "Two" => println("Two")
      case "Hello" => println("Hello")
      case _ => println("No")

    }



}
