# stream-processing-workshop

## Get Started
1. Use java 11
2. Execute the following commands
```
  > docker network create kafka
  > docker run -d --net=kafka --name=zookeeper -e ZOOKEEPER_CLIENT_PORT=2181 confluentinc/cp-zookeeper:6.1.1
  > docker run -d --net=kafka --name=kafka -p 9092:9092 -e KAFKA_ZOOKEEPER_CONNECT=zookeeper:2181 -e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092 -e KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR=1 confluentinc/cp-kafka:6.1.1
  > docker ps

```

3. Create a new IDE java/maven project from the `\sender`

4. Use maven build to generate some java classes in the `\sender` project:
```
  > mvn clean compile
```

### If you don't have Docker
You can get kafka and run it locally

Go to the kafka [quickstart](https://kafka.apache.org/quickstart):
1. Download the [latest](https://www.apache.org/dyn/closer.cgi?path=/kafka/2.7.0/kafka_2.13-2.7.0.tgz)
2. Start Zookeeper (Kafka provides you with a single node zookeeper instance)
```
  > bin/zookeeper-server-start.sh config/zookeeper.properties
```
3. start Kafka
```
  > bin/kafka-server-start.sh config/server.properties
```

That will get your kafka running on the default port: localhost:9092 and zookeeper on: localhost:2181
These are also the ports used by default by Spring Cloud Stream


## Labs

### Lab 1: send events to Kafka
[Send Events to Kafka](lab1.md)

### Lab 2: consume events from Kafka
[Consume Events from Kafka](lab2.md)

### Lab 3a: use Kafka Streams, stateless
[Use Kafka Streams, stateless](lab3.md)

### Lab 3b: make use of windows
[Use Windows with Kafka Streams](lab4.md)

### Lab 4: Think about how you would detect a traffic congestion
Think about how you would tackle the problem.
In how many steps would you process your data?

### Lab 0: some console commands
[Console Commands](lab0.md)
