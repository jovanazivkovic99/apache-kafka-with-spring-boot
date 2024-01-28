## Pravljenje aplikacije u Spring Boot-u

### Definisanje Consumera i Producera u `application.yml`

```yaml
spring:
  kafka:
    consumer:
      bootstrap-servers: localhost:9092
      group-id: myGroup # ID grupe consumera
      auto-offset-reset: earliest
      key-deserializer: org.apache.kafka.common.serialization.StringDeserializer
      value-deserializer: org.apache.kafka.common.serialization.StringDeserializer

    producer:
      bootstrap-servers: localhost:9092
      key-serializer: org.apache.kafka.common.serialization.StringSerializer
      value-serializer: org.apache.kafka.common.serialization.StringSerializer

