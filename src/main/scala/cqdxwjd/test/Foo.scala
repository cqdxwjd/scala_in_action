package cqdxwjd.test

class Foo {
  val i = 23
  val j = "blah"
  val k = i + j

  def wibble = {
    for (c <- k) yield c * 2
  }
}
