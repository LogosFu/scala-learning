package chapter2

import scala.io.Source

/**
  * Created with IntelliJ IDEA.
  * 读取文件的例子
  *
  * @author LogosFu
  * @since 2019-03-11 22:40
  */
object ReadFile {

  def main(args: Array[String]): Unit = {

    //文件的名字
    val fileName = ""
    for (line <- Source.fromFile(fileName).getLines())
      println(line.length + " " + line)
  }
}
