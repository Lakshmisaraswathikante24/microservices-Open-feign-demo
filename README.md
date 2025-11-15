# Microservices Communication using OpenFeign

This project demonstrates **inter-service communication** in a Spring Boot microservices architecture using:

- OpenFeign (Declarative REST Client)
- Provider Service
- Consumer Service

## 🔧 Services in this project
### 1. provider-service
- Runs on port **8081**
- Exposes endpoint:
GET /instance-info



### 2. consumer-service
- Runs on port **8080**
- Calls provider service using Feign:
GET /api/feign/instance



## 📌 Technologies Used
- Spring Boot
- Spring Cloud OpenFeign
- REST API
- Java 17

## 🚀 How to Run
1. Start **provider-service**
2. Start **consumer-service**
3. Open browser:
http://localhost:8080/api/feign/instance



You should see the provider's response.

## 🤝 Author
LakshmiSaraswathi kante.
