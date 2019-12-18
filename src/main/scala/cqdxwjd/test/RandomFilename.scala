package cqdxwjd.test

import scala.math.BigInt.probablePrime
import scala.util.Random

object RandomFilename {
  def main(args: Array[String]): Unit = {
    var random = probablePrime(100, Random)
    val filename = random.toString(36)
    println(filename)
  }
}
