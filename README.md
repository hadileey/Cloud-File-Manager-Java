# ☁️ Cloud Storage File Manager (Java + JDBC)

## 📌 Overview

The **Cloud Storage File Manager** is a mini-project developed using **Java and JDBC** that simulates the core functionality of a cloud-based file storage system.

This application allows users to securely manage their files by providing features such as **user authentication, file upload, storage management, and retrieval**.

The project demonstrates how backend systems interact with databases and file systems, making it a practical implementation of **database connectivity and file handling concepts**.

---

## 🎯 Objectives

* To implement a **file management system** using Java
* To understand **JDBC connectivity with MySQL database**
* To simulate a **cloud storage environment locally**
* To perform **CRUD operations** on file metadata
* To build a structured project using **layered architecture (MVC-like)**

---

## 🧠 Key Features

### 👤 User Management

* User Registration
* User Login Authentication
* Secure credential validation using database

### 📁 File Management

* Upload files to local storage
* Store file metadata in database
* View list of uploaded files
* Delete files
* Simulated download functionality

### 🗄️ Database Integration

* JDBC used for database connectivity
* MySQL database to store users and file details

---

## 🛠️ Tech Stack

| Technology | Purpose                   |
| ---------- | ------------------------- |
| Java       | Core programming language |
| JDBC       | Database connectivity     |
| MySQL      | Data storage              |
| File I/O   | File handling             |
| GitHub     | Version control           |

---

## 🏗️ System Architecture

```plaintext
UI Layer → Service Layer → DAO Layer → Database
                     ↓
                 File System
```

### Explanation:

* **UI Layer**: Handles user interaction
* **Service Layer**: Business logic
* **DAO Layer**: Database operations
* **Database**: Stores user and file metadata
* **File System**: Stores actual files

---

## 📂 Project Structure

```plaintext
CloudFileManager/
│
├── src/
│   ├── config/        # Database connection
│   ├── model/         # Data classes
│   ├── dao/           # Database operations
│   ├── service/       # Business logic
│   ├── utils/         # File utilities
│   ├── ui/            # User interface (basic)
│   └── Main.java      # Entry point
│
├── storage/           # Stored files
├── database/          # SQL scripts
└── README.md
```

---

## 🗄️ Database Schema

### Users Table

```sql
id (PK), username, password
```

### Files Table

```sql
id (PK), user_id (FK), file_name, file_path, upload_date
```

---

## 🔄 Workflow

1. User registers or logs in
2. Dashboard is displayed
3. User uploads file
4. File is stored in local storage
5. File metadata saved in database
6. User can view/delete/download files

---

## ⚙️ Installation & Setup

### 1. Clone Repository

```bash
git clone https://github.com/your-username/Cloud-File-Manager-Java.git
```

### 2. Setup Database

* Create MySQL database
* Run `schema.sql`

### 3. Configure DB Connection

Update credentials in:

```
config/DBConnection.java
```

### 4. Run Project

* Open in IntelliJ / Eclipse
* Run `Main.java`

---

## 🚀 Future Enhancements

* Cloud integration (AWS / Firebase)
* File sharing between users
* Drag & drop upload
* Encryption for secure storage
* Web-based UI using React

---

## ⚠️ Limitations

* Files stored locally (not real cloud)
* Basic authentication (no encryption)
* Limited UI functionality
* No real-time sync

---

## 📚 Learning Outcomes

* Hands-on experience with **JDBC**
* Understanding of **layered architecture**
* Implementation of **file handling in Java**
* Integration of **database with application logic**

---

## 👨‍💻 Author

**HADIL K K**
BE CSE (4th Semester)

---

## 📄 License

This project is developed for academic purposes.

---

## ⭐ Acknowledgment

This project was developed as part of the **mini project requirement** in the Computer Science Engineering curriculum.
