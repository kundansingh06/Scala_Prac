package src.main.scala.example_4constructor

class Class_PrimaryConstructor(var name: String, var breed: String, var age: Int, var color: String) {
  println("My name is:" + name + " my breed is:" + breed);
  println("I am: " + age + " and my color is :" + color);
}

object Main {
  def main(args: Array[String]) {

    // Class object
    var obj = new Class_PrimaryConstructor("tuffy", "papillon", 5, "white");
  }

}