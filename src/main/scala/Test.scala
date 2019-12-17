object Test {
  def main(args: Array[String]): Unit = {
    var b = 'a' + 1
    print(b)

    var c = 97 + 1
    print(c)
    val bool = c.isInstanceOf[Int]
    println(bool)

    val unit = sayHello()
    print(unit)

    10 max 2
  }

  def sayHello(): Unit = {

  }
}