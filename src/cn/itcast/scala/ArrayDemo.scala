package cn.itcast.scala

import scala.collection.mutable.ArrayBuffer

object ArrayDemo {
  def main(args: Array[String]): Unit = {
    // 初始化一个长度为8的定长数组，其所有元素均为0
    val arr1: Array[Int] = new Array[Int](8)
    // 直接打印定长数组，内容为数组的hashCode值
    println(arr1)
    // 变长数组（数组缓冲）
    // 如果使用数组缓冲，需要导入import scala.collection.mutable.ArrayBuffer
    val ab: ArrayBuffer[Int] = ArrayBuffer[Int]()
    // 向数组缓冲的尾部追加一个元素
    // +=尾部追加元素
    ab += 1
    println(ab)
    // 追加多个元素
    ab += (2, 3, 4, 5)
    println(ab)
    // 追加一个数组++=
    ab ++= Array(6, 7)
    println(ab)
    // 追加一个数组缓冲
    ab ++= ArrayBuffer(8, 9)
    println(ab)
    // 在数组某个位置插入元素用insert，从某个下标插入
    ab.insert(4, -3, 9)
    println(ab)
    // 用remove跟下标删除数组某个位置的元素
    ab.remove(1)
    println(ab)
  }
}
