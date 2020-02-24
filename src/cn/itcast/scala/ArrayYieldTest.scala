package cn.itcast.scala

/**
  * 数组转换
  */
object ArrayYieldTest {
  def main(args: Array[String]): Unit = {
    // 定义一个数组
    val arr: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
    // 将偶数取出乘以10后再生成一个新的数组
    val newArr: Array[Int] = for (e <- arr if e % 2 == 0) yield e * 10
    println(newArr.toBuffer)
  }
}
