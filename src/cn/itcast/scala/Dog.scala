package cn.itcast.scala

class Dog {
  val id: Int = 666
  private var name: String = "二哈"
  def printName(): Unit ={
    // 在Dog类中可以访问伴生对象Dog的私有字段
    println(Dog.CONSTANT + name)
  }
}

/**
  * 伴生对象
   */
object Dog {
  // 伴生对象中的私有字段
  private var CONSTANT: String = "汪汪汪。。。"
  // 主方法
  def main(args: Array[String]): Unit = {
    val dog: Dog = new Dog
    // 访问私有字段name
    dog.name = "二哈666"
    dog.printName()
  }
}
