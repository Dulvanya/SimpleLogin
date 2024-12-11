# Simple Login Form using Java, MySQL, and Visual Studio Code

## 📋 **Project Overview**
This repository contains a simple login form application built using **Java** as the programming language, **MySQL** as the database, and **Visual Studio Code** as the development environment. The application allows users to log in using their credentials, which are verified against a MySQL database.

---

## ✨ **Features**
- **User Authentication**: Validates user credentials (username and password) against the database.
- **MySQL Database Integration**: Uses MySQL to store and retrieve user information.
- **Error Handling**: Provides clear error messages for incorrect login attempts.
- **Simple and Intuitive UI**: User-friendly design to facilitate easy login.

---

## 🛠️ **Technologies Used**
- **Programming Language**: Java
- **Database**: MySQL
- **IDE**: Visual Studio Code
- **Libraries/Dependencies**:
  - JDBC (Java Database Connectivity) for MySQL connection

---

## 📂 **Project Structure**
```
├── src
│   └── Main.java         # Main application file
│   └── DatabaseConnection.java # Handles MySQL database connection
│   └── LoginForm.java    # Contains the login form UI and functionality
├── lib
│   └── mysql-connector.jar  # MySQL JDBC driver
├── README.md             # Project documentation
└── .gitignore            # Git ignore file
```

---

## ⚙️ **Setup Instructions**

### 1️⃣ **Prerequisites**
- **Java Development Kit (JDK)**: Ensure you have JDK 8 or higher installed.
- **MySQL Database**: Ensure MySQL is installed and running.
- **Visual Studio Code**: Download and install Visual Studio Code.
- **MySQL JDBC Driver**: Add `mysql-connector.jar` to the `lib` folder.

### 2️⃣ **Database Setup**
1. Open MySQL Workbench or use the command line.
2. Create a database named `user_db`:
   ```sql
   CREATE DATABASE user_db;
   ```
3. Create a table `users` with the following structure:
   ```sql
   CREATE TABLE users (
       id INT AUTO_INCREMENT PRIMARY KEY,
       username VARCHAR(50) NOT NULL,
       password VARCHAR(100) NOT NULL
   );
   ```
4. Insert some sample user data:
   ```sql
   INSERT INTO users (username, password) VALUES ('admin', 'password123');
   ```

### 3️⃣ **Clone the Repository**
```
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

### 4️⃣ **Configure Database Connection**
- Open `DatabaseConnection.java` and update the database URL, username, and password.
```java
private static final String URL = "jdbc:mysql://localhost:3306/user_db";
private static final String USER = "your_mysql_username";
private static final String PASSWORD = "your_mysql_password";
```

### 5️⃣ **Run the Application**
1. Open the project in Visual Studio Code.
2. Compile the Java files:
   ```bash
   javac -cp .:lib/mysql-connector.jar src/*.java
   ```
3. Run the main file:
   ```bash
   java -cp .:lib/mysql-connector.jar src.Main
   ```

---

## 📸 **Screenshots**

| **Login Form** |
|-----------------|
| ![Login Form](path/to/screenshot.png) |

---

## 📢 **How to Use**
1. Launch the application.
2. Enter your **username** and **password**.
3. Click the **Login** button.
4. If the credentials match, you will be logged in successfully. If not, an error message will be displayed.

---

## 🔧 **Possible Improvements**
- Add password encryption for enhanced security.
- Implement user registration to allow new users to sign up.
- Add a "Forgot Password" feature.

---

## 📝 **Contributing**
Contributions, issues, and feature requests are welcome! Feel free to check out the [issues page](https://github.com/your-username/your-repo-name/issues) if you want to contribute.

---

## 📜 **License**
This project is licensed under the MIT License. See the `LICENSE` file for details.

---

## 📞 **Contact**
If you have any questions or suggestions, feel free to reach out via [eadndp@gmail.com](mailto:your-email@example.com).

