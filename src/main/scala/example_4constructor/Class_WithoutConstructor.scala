package src.main.scala.example_4constructor

class Class_WithoutConstructor {
    var number: Int = 16
    var nameofcompany: String = "Apple"
    // Class method
    def Display(){
        println("Name of the company : " + nameofcompany);
        println("Total number of Smartphone generation: " + number);
    }
}
object Main1 {
    def main(args: Array[String]) {

        // Class object
        var obj = new Class_WithoutConstructor();
        obj.Display();
    }
}