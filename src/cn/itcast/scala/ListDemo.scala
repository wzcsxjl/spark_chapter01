package cn.itcast.scala

object ListDemo {
  def main(args: Array[String]): Unit = {
    demo1

    // 可以使用Nil和::操作符来定义列表。其中，Nil表示空列表；::意为构造，向列表的头部追加数据，创造新列表。
    // 字符串
    val fruit: List[String] = "apples" :: ("oranges" :: ("pears" :: Nil))
    // 整型
    val nums: List[Int] = 1 :: (2 :: (3 :: (4 :: Nil)))
    // 空列表
    val empty: List[Nothing] = Nil
    // 二维列表

    val dim: List[List[Int]] = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil
  }

  private def demo1: Unit = {
    // 字符串
    val fruit: List[String] = List("apples", "oranges", "pears")
    // 整型
    val nums: List[Int] = List(1, 2, 3, 4)
    // 空
    val empty: List[Nothing] = List()
    // 二维列表
    val dim: List[List[Int]] = List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )
  }
}
