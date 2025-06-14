# Student Faculty Management Backend

This is a Spring Boot-based backend for managing students and faculty members in a college. It provides RESTful APIs for authentication (login/register), and full CRUD operations for both students and faculty data. The backend is built using Java, Spring Boot, and MySQL.

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Security**
- **MySQL**
- **Maven**

---

## 📁 Project Structure

```

src/
├── main/
│   ├── java/com/college/studentfacultymanagement/
│   │   ├── controller/
│   │   ├── model/
│   │   ├── repository/
│   │   ├── service/
│   │   └── config/
│   └── resources/
│       ├── application.properties

````

---

## ⚙️ Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/Monalisa-XD/student-faculty-management-backend.git
cd student-faculty-management-backend
````

### 2. Configure MySQL

Ensure MySQL is running and update your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/college
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

### 3. Build and Run

```bash
./mvnw spring-boot:run
```

---

## 🚀 API Endpoints

### 🔐 Auth

| Method | Endpoint    | Description         |
| ------ | ----------- | ------------------- |
| POST   | `/register` | Register a new user |
| POST   | `/login`    | Login a user        |

### 👨‍🏫 Faculty

| Method | Endpoint        | Description             |
| ------ | --------------- | ----------------------- |
| GET    | `/faculty`      | Get all faculty members |
| POST   | `/faculty`      | Add a new faculty       |
| PUT    | `/faculty/{id}` | Update a faculty member |
| DELETE | `/faculty/{id}` | Delete a faculty member |

### 👩‍🎓 Student

| Method | Endpoint         | Description       |
| ------ | ---------------- | ----------------- |
| GET    | `/students`      | Get all students  |
| POST   | `/students`      | Add a new student |
| PUT    | `/students/{id}` | Update a student  |
| DELETE | `/students/{id}` | Delete a student  |

---

## 📄 Sample Entities

### User

```json
{
  "name": "Admin",
  "email": "admin@example.com",
  "password": "password"
}
```

### Faculty

```json
{
  "name": "Dr. Asha Kumari",
  "department": "Computer Science",
  "specialization": "AI",
  "email": "asha@college.edu",
  "phone": "9876543210",
  "education": "Ph.D",
  "isHod": true,
  "joiningDate": "2015-06-15"
}
```

### Student

```json
{
  "name": "Rohan Mehta",
  "email": "rohan@student.edu",
  "phone": "9123456780",
  "department": "Computer Science",
  "rollNumber": "CSE2023A01",
  "admissionDate": "2023-08-01",
  "semester": "2",
  "dob": "2005-02-15",
  "gender": "Male",
  "address": "123 Tech Lane",
  "guardianName": "Rajeev Mehta",
  "guardianPhone": "9812345670"
}
```

---

## 📬 Contact

For questions or contributions, feel free to open an issue or pull request.

---