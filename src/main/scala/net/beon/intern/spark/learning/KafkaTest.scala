package net.beon.intern.spark.learning


import java.nio.file.{Files, Paths}

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.avro._

object KafkaTest {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder().appName("Kafka Test").master("local").getOrCreate()
    import spark.implicits._

    //val schemaFile = new String(Files.readAllBytes(Paths.get("src/main/resources/schema.avsc")))
    val schemaFile = "/src/main/resources/schema.avsc"

    val df = spark.read.format("kafka")
      .option("kafka.bootstrap.servers", "hadoop-fra-5.intern.beon.net:9092")
      .option("subscribe", "test1")
      .load()

    val xxx = df.selectExpr("CAST(key AS STRING)", "CAST(value AS STRING)")
    xxx.show()


    //df.select(from_avro($"value", "schemaFile").as("user")).show()

    //df.show()
    //val xxx = df.schema
    //println(xxx)
  }

}
