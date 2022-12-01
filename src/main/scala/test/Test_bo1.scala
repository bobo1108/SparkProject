package test

import com.msbjy.scala.musicproject.common.ConfigUtils

/**
  * Create by Thinkpad on 2022/5/17.
  */
object Test_bo1 {
  def main(args: Array[String]): Unit = {
    val kafkabrokers: String = ConfigUtils.KAFKA_BROKERS
    println(kafkabrokers)
  }
}
