package net.beon.intern.spark.learning

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._

object PoplarMovie {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().appName("Popular Movie Analysis").master("local").getOrCreate()
    import spark.implicits._

    val data = spark.read.option("inferSchema","true").option("sep","\t")
      .csv("hdfs://hadoop-fra-1.intern.beon.net:8020/tmp/data/popular_movies.txt")
      .toDF("User ID","Movie ID","Rating","Time stamp")

    val pm= data.groupBy("Movie ID").count().orderBy(desc("count"))
    //val pm= data.groupBy("Movie ID").count().orderBy($"count".desc)

    pm.show()

  }

}
