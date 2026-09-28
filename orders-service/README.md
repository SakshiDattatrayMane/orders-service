# orders-service (practice project)

Tiny Spring Boot app used to practise git -> Jenkins -> Docker -> Kubernetes -> AWS.

Run locally:      mvn spring-boot:run
Test:             mvn test
Open:             http://localhost:8080/orders/7/status
Health:           http://localhost:8080/actuator/health

Docker:           docker build -t orders-service:1 .
                  docker run -p 8080:8080 orders-service:1
