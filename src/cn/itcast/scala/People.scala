package cn.itcast.scala

/**
  * 特质
  */
trait Animal {
  // 没有实现
  def speak()

  def listen(): Unit = {}

  def run(): Unit = {
    println("I'm running")
  }
}

class People extends Animal {
  override def speak(): Unit = {
    println("I'm speaking English")
  }
}

object People {
  def main(args: Array[String]): Unit = {
    var people: People = new People
    people.speak()
    people.listen()
    people.run()
  }
}
