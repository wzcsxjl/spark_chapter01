package cn.itcast.scala

/**
  * 单例对象
  */
object SingletonObject {
  def Hello() {
    println("Hello, this is Singleton Object")
  }
}

object Singleton {
  def main(args: Array[String]): Unit = {
    SingletonObject.Hello()
  }
}
