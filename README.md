# spring-cloud-feign-swagger-demo-project

REST APIs implemented using Spring Boot Maven Project

Services Created In this Project :

Service Discovery
Product
Customer


How to Run

Open the project in any IDE, build and run all 3 springboot applications. Run in below order :

Service Discovery Microservice
Product Microservice
Customer Microservice

REST APIs Endpoints

GET /products

POST /products - create resource
INPUT : 
{
  "id": "PRD1",
  "name": "Product Name 1",
  "price": "USD 1001",
  "customerId": "CUST1"
}

GET /products/{id} - getProductById
INPUT Id : PRD1/PRD2/PRD3/PRD4/PRD5 (anyone)

GET /products/customer/{custId} - istProductsByCustomerId
INPUT Id : cust1/cust2/cust3/cust4/cust4 (anyone)

GET /customers/{id}
INPIUT Id : cust1/cust2/cust3/cust4/cust4

To view Swagger 2 API docs
Run the server and browse to http://localhost:8090/swagger-ui.html for Customer Endpoint

http://localhost:8089/swagger-ui.html for Product Endpoints

For Web Security :

spring-boot-starter-security is used for basic authetication. 

Enter username - user/admin
Enter Password - password


