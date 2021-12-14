package Init_Cleaning

import org.apache.spark.sql.SparkSession

object Spark {
  def spark(): SparkSession = {
    SparkSession.builder().master(master = "local[*]").appName("Spark1").getOrCreate()
  }
}
