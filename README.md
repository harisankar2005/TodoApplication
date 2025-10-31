# 📝 Todo Application

A **full-stack Todo Application** built using **Spring Boot** (backend) and **HTML, CSS, and JavaScript** (frontend).
This project allows users to **register, log in, and manage their daily tasks** securely and efficiently.
---

### 🚀 Features

### 🌐 Frontend

* Simple and responsive UI using **HTML, CSS, and JavaScript**
* Login and Registration pages
* Add, update, and delete todos dynamically
* JWT-based authentication support

### ⚙️ Backend (Spring Boot)

* RESTful APIs built using **Spring Boot**
* **JWT Authentication** for secure access
* **Spring Data JPA + H2 / MySQL** for database operations
* Modular architecture: Controller → Service → Repository

---

## 🗂️ Folder Structure

```
TodoApplication/
├── frontend/                   # Static frontend (HTML, CSS, JS)
│   ├── login.html
│   ├── register.html
│   ├── todos.html
│   ├── style.css
│   └── script.js
│
├── backend/                    # Spring Boot backend
│   ├── src/
│   │   ├── main/java/dev/codeio/HelloWorld/
│   │   │   ├── controller/
│   │   │   ├── models/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   ├── utils/
│   │   │   └── HelloWorldApplication.java
│   │   └── resources/application.properties
│   ├── pom.xml
│   └── mvnw, mvnw.cmd
│
└── README.md
```

---

## 🧠 How It Works

1. **User Registration/Login** → Auth handled via `AuthController` using JWT.
2. **Frontend** calls REST APIs → `TodoController` handles CRUD operations.
3. **Data Persistence** → `Spring Data JPA` saves user and todo info in DB.

---

## 🧰 Tech Stack

| Layer          | Technology            |
| :------------- | :-------------------- |
| Frontend       | HTML, CSS, JavaScript |
| Backend        | Java, Spring Boot     |
| Database       | H2 (default) / MySQL  |
| Authentication | JWT (JSON Web Token)  |
| Build Tool     | Maven                 |

---

## 🧩 Setup Instructions

### 🔹 Backend Setup

1. Open the project in **IntelliJ** or **VS Code with Java extension**.
2. Navigate to the `backend` folder:

   ```bash
   cd backend
   ```
3. Run the Spring Boot application:

   ```bash
   ./mvnw spring-boot:run
   ```
4. Backend runs at  **[http://localhost:8080](http://localhost:8080)**

### 🔹 Frontend Setup

1. Open the `frontend` folder.
2. Open `login.html` or `todos.html` in your browser.
3. Ensure API URLs point to `http://localhost:8080/api/...` in `script.js`.

---

## 📬 API Endpoints

| Method | Endpoint             | Description                   |
| :----- | :------------------- | :---------------------------- |
| POST   | `/api/auth/register` | Register new user             |
| POST   | `/api/auth/login`    | Login user and get JWT        |
| GET    | `/api/todos`         | Get all todos (user-specific) |
| POST   | `/api/todos`         | Add new todo                  |
| PUT    | `/api/todos/{id}`    | Update todo                   |
| DELETE | `/api/todos/{id}`    | Delete todo                   |

---

## 🧪 Example `.properties`

```properties
# Server
server.port=8080

# Database
spring.datasource.url=jdbc:h2:mem:todoapp
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true

# JPA
spring.jpa.hibernate.ddl-auto=update

# JWT
jwt.secret=my-secret-key
jwt.expiration=86400000
```

---

## 🧑‍💻 Author

**Hari Sankar**
🔗 [GitHub Profile](https://github.com/harisankar2005)

---

## 🏁 Future Improvements

* ✅ Add user profile settings
* ✅ Improve UI using React / Vue
* ✅ Dockerize backend for deployment
* ✅ Add email verification during registration

---

## 🎓 Credits

This project was built as part of my learning journey from the following tutorial:

🎥 **[Spring Boot Full Course with Project | Tamil | Code IO](https://www.youtube.com/watch?v=52YKZV_Qj3o&t=22418s)**
Special thanks to **Code IO** for the clear explanation and practical guidance on building a full-stack project using Spring Boot.

---

> 📘 *This project demonstrates full-stack development with Spring Boot and vanilla JavaScript integration for practical learning and portfolio building.*

