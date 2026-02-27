# Library Management System (Java OOP)

## 📌 Overview
This is a simple console-based Library Management System built using Java.

The project demonstrates core Object-Oriented Programming (OOP) concepts such as:
- Classes and Objects
- Encapsulation
- Method interaction between objects
- Collections (ArrayList)
- Basic state management

---

## 🧱 Project Structure

All classes are inside the package:

### 1️⃣ Book
Represents a book in the system.

Attributes:
- `BookName`
- `borrowed` (boolean)

Responsibilities:
- Track whether the book is borrowed
- Provide status via getters/setters
- Override `toString()` for readable output

---

### 2️⃣ Books_Sections
Represents a section in the library.

Attributes:
- `name`
- `List<Book> books`

Responsibilities:
- Add books
- Remove books
- Check if a book exists in the section

---

### 3️⃣ Visitors
Represents a library visitor.

Attributes:
- `VisitorName`
- `List<Book> HisBooks`

Responsibilities:
- Borrow a book (if available)
- Return a book
- Manage visitor's borrowed books

---

### 4️⃣ Main
Contains the program entry point.

Demonstrates:
- Creating books
- Adding books to section
- Borrowing and returning books
- Displaying system state

---

## 🔁 How Borrowing Works

When a visitor borrows a book:

1. Check if the book is already borrowed
2. Check if the section contains the book
3. Remove the book from the section
4. Mark it as borrowed
5. Add it to visitor’s list

---

## 🔁 How Returning Works

1. Check if visitor has the book
2. Remove it from visitor’s list
3. Mark it as not borrowed
4. Add it back to the section

---

## 🛠 Technologies Used

- Java
- OOP Principles
- ArrayList (Java Collections Framework)

---

## 🚀 Purpose of This Project

This project was built to strengthen my understanding of:
- Object interaction
- State management
- Designing simple OOP systems
- Building logic without external libraries

This is part of my Java OOP foundations journey.