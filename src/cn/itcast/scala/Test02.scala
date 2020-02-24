package cn.itcast.scala

/**
  * 计算100~999的所有水仙花数
  */
object Test02 {
  def main(args: Array[String]): Unit = {
    for (i <- 100 to 999) {
      val a: Int = i % 10 // 取个位数
      val b: Int = i % 100 / 10 // 取十位数
      val c: Int = i / 100 //取百位数
      if (a * a * a + b * b * b + c * c * c == i) {
        println(i)
      }
    }
  }
}
