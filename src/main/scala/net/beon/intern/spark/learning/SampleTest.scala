package net.beon.intern.spark.learning

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions._

object SampleTest {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().master("local").appName("sample test")
      .config("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
      .config("spark.scheduler.mode", "FAIR")
      .getOrCreate()
    import spark.implicits._

    //spark.sql("SET spark.sql.shuffle.partitions=10;")


    }
  }

