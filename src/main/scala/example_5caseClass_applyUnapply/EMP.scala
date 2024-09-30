package src.main.scala.example_5caseClass_applyUnapply

object EMP {
  def main(args: Array[String]): Unit = {

    println(apply("Kundan", "Singh"))
    println(unapply("Kundan,Singh"))

    def apply(fname: String, lname: String) = {
      fname + "," + lname
    }

    def unapply(str: String): Option[(String, String)] = {
      val parts = str.split(",")
      if (parts.length == 2) {
        Some(parts(0), parts(1))
      } else {
        None
      }
    }

  }

}