import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

public class SecuritiesTrading {
    public static void main(String[] args) {
        SparkSession spark = SparkSession.builder().appName("Securities Trading Application").getOrCreate();

        Dataset<Row> securitiesTradingData = spark.read().option("header", true).option("inferSchema", true).csv("2018-06-29_BINS_XETR14.csv");
        securitiesTradingData.show();

        spark.stop();

    }
}