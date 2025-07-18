# 🚀 Spring-Space-Station

A Spring Boot project for managing **Space Stations** with full CRUD functionality.

---

## ✅ Activity Requirements

This is a course project with the following mandatory requirements:

- [x] Create **CRUD operations** for **two new entities**  
- [x] Each entity must have **at least 4 fields**  
- [x] Entities must have a **relationship** between them  
- [x] All form fields must be **validated**  
- [x] The application must have a **home page or menu** for navigation

---

## 📐 Project Structure Example

The following **diagram** illustrates an example of how the entities might be structured:

<img src="https://github.com/user-attachments/assets/2d700cba-265e-4059-90b2-89d098736ce0" width="500" height="500"/>

> Entities used in the example:
> - `Estações`: references both `User` and `Empresa`
> - `User`: has attributes like name, gender, address, and email
> - `Empresa`: includes name, CNPJ, and number of employees

---

## 🧱 Artifacts to Deliver

- `Model` classes (domain/entities)
- `Repository` interfaces
- `Controllers` (handling routes and logic)
- `Listing pages` (Thymeleaf or similar)
- `Form pages` with validation

---

## 🛠 Technologies

- Java 17+  
- Spring Boot  
- Spring Data JPA  
- Thymeleaf  
- Hibernate Validator  
- H2 / MySQL
