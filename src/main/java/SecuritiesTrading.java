import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class SecuritiesTrading {
    public static void main(String[] args) {
        SparkSession spark = SparkSession.builder().appName("Securities Trading Application").getOrCreate();

        Dataset<Row> securitiesTradingData = spark.read().option("mode", "DROPMALFORMED").option("header", true).option("inferSchema", true).csv("s3a://oxclo-dbs/*");
        securitiesTradingData.show();

        spark.stop();

    }
}