package test

import com.msbjy.scala.musicproject.common.ConfigUtils

object Test2 {
  def main(args: Array[String]): Unit = {
    //println(ConfigUtils.LOCAL_RUN)
//    val kafkabrokers: String = ConfigUtils.KAFKA_BROKERS
//    println(kafkabrokers)


//    var str = "[1,2,3,4,5]"
//    println(str.stripPrefix("[").stripSuffix("]").split(","))


    val list: List[String] = List[String]("a", "b", "c", "d", "e")
    val strings: List[String] = list.slice(0,444)
    println(strings)
  }

}
