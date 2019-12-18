package cqdxwjd.test

object RepeatString {
  def main(args: Array[String]): Unit = {
    val str = "hello" * 3
    // val str = "hello".*(3)
    println(str)

    val str2 = "hello".getBytes()
    str2.foreach(println(_))
  }
}
