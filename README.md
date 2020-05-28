# DogStatsD java client example



A very basic example of DogStatsD usage with Java. This assumes the following prerequsites: 
+ You already have a JDK installed (ex: OpenJDK 11)
+ You already have a Datadog agent running.
  

### _Preliminary tasks_


**Building the application**

```
COMP10619:pejman.tabassomi$ ./gradlew build
```



### _Run the tests_

Open a new terminal window and run the following command:

```
COMP10619:Kafka pejman.tabassomi$ java -jar build/libs/statsdexample-1.0-SNAPSHOT.jar
Counter iteration: 0
Counter iteration: 1
Counter iteration: 2
Counter iteration: 3
Counter iteration: 4
Counter iteration: 5
Counter iteration: 6
Counter iteration: 7
Counter iteration: 8
Counter iteration: 9
Gauge iteration: 0
Gauge iteration: 1
Gauge iteration: 2
...
```


