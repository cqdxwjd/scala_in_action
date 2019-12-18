package cqdxwjd.test


object StringTest {
  def main(args: Array[String]): Unit = {
    // scala中获取字符串的第一个字符
    val head = "hello".head
    println(head)
    // scala中获取字符串的尾字符
    val last = "hello".last
    println(last)

    // StringOps.take: Selects first n elements.
    val str1 = "Hello World!" take 6
    println(str1)

    // StringOps.drop: Selects all elements except first n ones.
    val str2 = "Hello World!" drop 6
    println(str2)

    // StringOps.takeRight: Selects last n elements.
    println("Hello World!" takeRight 6)

    // StringOps.dropRight: Selects all elements except last n ones.
    println("Hello World!" dropRight 6)
  }
}
