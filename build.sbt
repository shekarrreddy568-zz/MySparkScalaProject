name := "MySparkScalaProject"

version := "0.1"

scalaVersion := "2.11.12"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-avro
libraryDependencies += "org.apache.spark" %% "spark-avro" % "2.4.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming-kafka-0-10
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.4.0"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql-kafka-0-10
libraryDependencies += "org.apache.spark" %% "spark-sql-kafka-0-10" % "2.4.0"


////// Accessing HDFS /////////////

// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-hdfs
libraryDependencies += "org.apache.hadoop" % "hadoop-hdfs" % "3.0.0"

// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-client
libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "3.0.0"

////////// Access Resource Manager //////////////////////

// https://mvnrepository.com/artifact/org.apache.spark/spark-yarn
libraryDependencies += "org.apache.spark" %% "spark-yarn" % "2.4.0"

////// Jackson Dependencies //////////
dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.9.8"
dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.8"
dependencyOverrides += "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.9.8"


////// Spark - Hive ////////////////
//// https://mvnrepository.com/artifact/org.apache.spark/spark-hive
//libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.4.0" % "provided"
//
//// https://mvnrepository.com/artifact/org.apache.spark/spark-hive-thriftserver
//libraryDependencies += "org.apache.spark" %% "spark-hive-thriftserver" % "2.4.0" % "provided"
//
//// https://mvnrepository.com/artifact/org.apache.hive/hive-jdbc
//libraryDependencies += "org.apache.hive" % "hive-jdbc" % "2.1.1"
//
//// https://mvnrepository.com/artifact/org.apache.hive/hive-metastore
//libraryDependencies += "org.apache.hive" % "hive-metastore" % "2.1.1"
//
//// https://mvnrepository.com/artifact/org.apache.hive/hive-exec
//libraryDependencies += "org.apache.hive" % "hive-exec" % "2.1.1"
//
//// https://mvnrepository.com/artifact/org.apache.hive/hive-common
//libraryDependencies += "org.apache.hive" % "hive-common" % "2.1.1"
//
//// https://mvnrepository.com/artifact/org.apache.hive/hive-service
//libraryDependencies += "org.apache.hive" % "hive-service" % "2.1.1"

//libraryDependencies += "org.pentaho" % "pentaho-aggdesigner-algorithm" % "5.1.5-jhyde" % Test
//resolvers += Resolver.mavenLocal
//resolvers += "Cascading repo" at "http://conjars.org/repo"
//
//// https://mvnrepository.com/artifact/org.apache.calcite/calcite-core
//libraryDependencies += "org.apache.calcite" % "calcite-core" % "1.18.0"
//
//// https://mvnrepository.com/artifact/org.apache.calcite/calcite-avatica
//libraryDependencies += "org.apache.calcite" % "calcite-avatica" % "1.6.0"

// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-hdfs-client
//libraryDependencies += "org.apache.hadoop" % "hadoop-hdfs-client" % "3.0.0" % "provided"

// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-common
//libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "3.0.0"

// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-core
//libraryDependencies += "org.apache.hadoop" % "hadoop-core" % "1.2.1"


// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-yarn-client
//libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-client" % "3.0.0"

// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-mapreduce-client-core
//libraryDependencies += "org.apache.hadoop" % "hadoop-mapreduce-client-core" % "3.0.0"

// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-mapreduce-client-jobclient
//libraryDependencies += "org.apache.hadoop" % "hadoop-mapreduce-client-jobclient" % "3.0.0" % "provided"

// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-mapreduce-client-common
//libraryDependencies += "org.apache.hadoop" % "hadoop-mapreduce-client-common" % "3.0.0"

// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-yarn-api
//libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-api" % "3.0.0"

// https://mvnrepository.com/artifact/org.apache.hadoop/hadoop-yarn-common
//libraryDependencies += "org.apache.hadoop" % "hadoop-yarn-common" % "3.0.0"
