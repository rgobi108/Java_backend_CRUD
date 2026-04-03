# User Management System (Spring Boot CRUD)

This is a simple backend project built using **Spring Boot** that provides REST APIs for managing users.

---

## 🚀 Features

- Add User
- View All Users
- Update User
- Delete User

---

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- REST API

---

## 📁 Project Structure
com.example.demo
│
├── model → User Entity
├── repository → JPA Repository
├── service → Business Logic
├── controller → REST APIs

---

## 📌 API Endpoints

| Method | Endpoint        | Description       |
|--------|---------------|------------------|
| GET    | /users        | Get all users     |
| POST   | /users        | Add new user      |
| PUT    | /users/{id}   | Update user       |
| DELETE | /users/{id}   | Delete user       |

---

## ⚙️ Configuration

Update `application.properties`:
spring.datasource.url=jdbc:mysql://localhost:3306/testdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


---

## 🧪 Sample JSON

### Create / Update User
```json
{
  "name": "John",
  "email": "john@example.com"
}How to Run
Clone the repository
git clone https://github.com/rgobi108/Java_backend_CRUD.git
Open in IDE (IntelliJ / Eclipse)
Run the main class
Test APIs using Postman
📌 Future Improvements
Add validation
Add exception handling
Connect with React frontend
Add authentication (login system)
👨‍💻 Author

Gobi R


---

## ✅ Next Step (Push README)

Run this:

```bash
git add README.md
git commit -m "Added README"
git push
