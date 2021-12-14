package sql

import Init_Cleaning.{Dataset, Spark}

object sql_functions {
  def main(args: Array[String]): Unit = {
    val spark = Spark.spark()
    val df: Unit = Dataset.Sql_Dataset.createOrReplaceTempView("dataset")


    val table = spark.sql("SELECT avg(Age) " +
      "FROM dataset " +
      "group by City ")
    table.show()

    System.in.read()
    spark.stop()

    /*val Total_refund = spark.sql("Select sum(S.amount*S.quantity)-sum(R.amountR*R.quantityR) as Net " +
      "From Sales as S " +
      "Inner join Refund as R ON S.txID = R.txID")
    Total_refund.show()*/
  }

}
