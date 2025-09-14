# PBL API Example

A simple Spring Boot REST API.

## Project Structure
```
student-api/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── studentapi/
│       │               ├── StudentApiApplication.java
│       │               ├── controller/
│       │               │   └── StudentController.java
│       │               ├── model/
│       │               │   └── Student.java
│       │               └── service/
│       │                   └── StudentService.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
```

## How to Run

1. **Prerequisites:**
   - Java 17 or later
   - Maven 3.6+

2. **Clone and run:**
   ```bash
   git clone <your-repo-url>
   cd pbl-api
   mvn spring-boot:run
   ```

3. **Test the endpoints:**
   - Health check: `GET http://localhost:8080/api/health`
   - Get all students: `GET http://localhost:8080/api/students`

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/health` | Health check endpoint |
| GET | `/api/students` | Get all students |

## Example Response

### GET /api/health
```json
{
  "status": "UP",
  "message": "Student API is running successfully"
}
```

### GET /api/students
```json
[
  {
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@email.com",
    "age": 20
  },
  {
    "id": 2,
    "firstName": "Jane",
    "lastName": "Smith",
    "email": "jane.smith@email.com",
    "age": 22
  }
]
```

## Next Steps for Students

This is a basic template. Students can extend it by:
- Adding more CRUD endpoints (POST, PUT, DELETE)
- Implementing a database with JPA/Hibernate
- Adding validation and error handling
- Implementing unit tests
- Adding pagination and sorting
- Adding authentication/authorization