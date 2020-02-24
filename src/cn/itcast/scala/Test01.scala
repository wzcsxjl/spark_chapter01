package cn.itcast.scala

/**
  * 需求：
  *   1. 取列表前5个元素
  *   2. 判断列表是否包含元素0
  */
object Test01 {
  def main(args: Array[String]): Unit = {
    var list: List[Int] = List(1, 3, 2, 5, 4, 7, 8, 6, 9, 0)
    // 取前5个元素
    println(list.take(5))
    // 判断是否包含元素0
    println(list.contains(0))
  }
}
