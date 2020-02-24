package cn.itcast.scala

object ListTest {
  def main(args: Array[String]): Unit = {
    val fruit: List[String] = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums = Nil
    println("Head of fruit: " + fruit.head)
    println("Tail of fruit: " + fruit.tail)
    println("Check if fruit is empty: " + fruit.isEmpty)
    println("Check if nums is empty: " + nums.isEmpty)
    println("Take of fruit: " + fruit.take(2))
    println("Contains of fruit: " + fruit.contains("apples"))
  }
}
