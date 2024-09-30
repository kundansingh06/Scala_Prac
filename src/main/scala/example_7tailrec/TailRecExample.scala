package src.main.scala.example_7tailrec

import scala.annotation.tailrec
object TailRecExample {
  def main(args: Array[String]) {
    println(factorial(4))
    getFibonacci(4)
  }

  def factorial(n: Int): Int = {
    @tailrec
    def factorialAcc(acc: Int, n: Int): Int = {
      if (n <= 1) acc
      else factorialAcc(n * acc, n - 1)
    }
    factorialAcc(1, n)
  }


  def getFibonacci(n: Int): Int = {
    @tailrec
    def getTailRec(n: Int, a: Int, b: Int): Int = {
      println(b)
      if (n <= 0) {
        b
      } else {
        getTailRec(n - 1, a = a + b, b = a)
      }
    }
    getTailRec(n, a = 1, b = 0)
  }



}