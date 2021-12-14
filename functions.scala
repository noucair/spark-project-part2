package functions

import Init_Cleaning.{Dataset, Spark}

object functions {
  def main(args: Array[String]): Unit = {
    val spark = Spark.spark()
    val df = Dataset.Sql_Dataset

    df.show()
    val df_1 = df.groupBy("Gender").count()
    df_1.show()

    /*val df_produit_2013 = df_sales_2013.withColumn("Produit",col("amount")*col("quantity"))
    val df_total_2013 = df_produit_2013.filter("Annee == 2013").agg(sum("Produit"))
    df_total_2013.show()*/
    System.in.read()
    spark.stop()
  }

}


