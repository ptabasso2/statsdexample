# DogStatsD java client example



A very basic example of DogStatsD usage with Java. This assumes the following prerequsites: 
+ You already have a JDK installed (ex: OpenJDK 11)
+ You already have a Datadog agent running.

```
COMP10619:pejman.tabassomi$ DOCKER_CONTENT_TRUST=1 docker run -d --rm --name datadog_agent \
-h datadog -v /var/run/docker.sock:/var/run/docker.sock:ro -v /proc/:/host/proc/:ro \
-v /sys/fs/cgroup/:/host/sys/fs/cgroup:ro \
-p 8126:8126 -p 8125:8125/udp -e DD_API_KEY=cd741bcfa9ea6f113041444ff4ba6174 -e DD_APM_ENABLED=true \
-e DD_APM_NON_LOCAL_TRAFFIC=true -e DD_PROCESS_AGENT_ENABLED=true -e DD_DOGSTATSD_NON_LOCAL_TRAFFIC="true" \
-e DD_LOG_LEVEL=debug datadog/agent:7
```

	
  

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


