# Training Centers Registry API

## Overview
This project is an MVP for a registry of government-funded training centers. It provides APIs to create and retrieve training center information.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL

## Setup Instructions

### Prerequisites
- Install Java 17 or later
- Install PostgreSQL
- Install Maven

### Configuration
Update your terminal environment variables before running the application(postgreSQL - default port used, update according to your DBMS):

Windows:
```sh
set DB_HOST=localhost
set DB_PORT=5432
set DB_NAME=<YOUR_DB_NAME> 
set DB_USER=myuser
set DB_PASSWORD=mypassword
```

Linux/macOS:
```sh
export DB_HOST=localhost
export DB_PORT=5432
export DB_NAME=<YOUR_DB_NAME> 
export DB_USER=myuser
export DB_PASSWORD=mypassword
```

Alternatively, you can update `application.properties`:

```
spring.application.name=Training Centers Registry

spring.datasource.url=jdbc:postgresql://${DB_HOST}:${DB_PORT}/${DB_NAME}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}

spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### Running the Application
1. Clone the repository:
   ```sh
   git clone https://github.com/tulsipatil/Backend_Traini8_TulsiPatil.git
   ```
2. Build the project:
   ```sh
   mvn clean install
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints

### 1. Create a Training Center (POST `/api/centers`)
- Validates and saves a new training center in the database.
- Returns the saved training center details.
- Handles validation errors with appropriate messages.

### 2. Get All Training Centers (GET `/api/centers`)
- Returns a list of all stored training centers.
- Returns an empty list if no training centers exist.

## Error Handling
- This project uses a Global Exception Handler to manage validation errors and return structured responses.
- Handles cases like invalid center code, email, and phone number.

## Database Setup  
Ensure the database is created before running the application. If it doesn’t exist, create it manually:  

```sql  
CREATE DATABASE <YOUR_DB_NAME>;  
```  

## Postman API Screenshots

### Training Center Created Successfully
![Center Created](src/main/resources/static/center_created.png)

### Exception on Invalid Center Code
![Validation Exception](src/main/resources/static/center_validation_error.png)

### Get All Centers
![Get All Centers](src/main/resources/static/get_all_centers.png)

### Empty List of Centers - when no center exists
![Empty List Centers](src/main/resources/static/emptylist_centers.png)

## Architecture
This project follows a **layered architecture**, ensuring separation of concerns and maintainability:

- **Controller Layer**: Handles HTTP requests and responses.
- **Service Layer**: Contains business logic and interacts with the repository.
- **Repository Layer**: Communicates with the database using Spring Data JPA.
- **Exception Handling**: Uses a global exception handler to manage errors efficiently.

## Advantages
- **Scalability**: The layered architecture makes it easy to extend functionality.
- **Validation**: Uses annotations for validation, reducing boilerplate code.
- **Error Handling**: A global exception handler ensures structured error responses.
- **Database Independence**: Uses Spring Data JPA, allowing easy database changes.
- **Environment Flexibility**: Configuration through environment variables for better deployment.

