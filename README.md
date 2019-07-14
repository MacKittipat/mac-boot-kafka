# mac-boot-kafka

```
docker-compose up

# Create Topic
./kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic mac-topic

# List all topic
./kafka-topics.sh --list --zookeeper localhost:2181

# View message in topic
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic mac-topic --from-beginning

```


## Reference 

* https://www.confluent.io/blog/apache-kafka-spring-boot-application
* https://docs.spring.io/spring-kafka/docs/2.2.7.RELEASE/reference/html/
