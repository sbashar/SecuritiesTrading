# Securities Trading 

A repository for a securities trading big data application. 

# Run the project

The project can be run by adding the following in run configuration VM options:

```bash
-Dspark.master=local[*]
```

The project can also be run via command line by doing the following:

```bash
mvn package
SPARK_HOME/bin/spark-submit --class "SecuritiesTrading" --master local[*] target/Securities-Trading-1.0.jar
```