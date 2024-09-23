
# Shopping Mall Management System

## Overview

The **Shopping Mall Management System** is a Spring Boot-based web application designed to manage a shopping mall. The system allows mall administrators to manage stores, employees, customers, and more. This application provides APIs to handle various operations such as adding and managing stores, employees, and products.

---

## Features

- **Store Management:** Create, update, and delete stores in the mall.
- **Employee Management:** Add, edit, and delete employee details.
- **Customer Management:** Manage customer information and interaction with stores.
- **Product Management:** Manage products available in the mall.
- **Search Functionality:** Search for stores and products.

---

## Purpose

The purpose of this project is to streamline the operations of a shopping mall by offering an integrated solution that enables administrators to efficiently manage various entities within the mall.

---

## Technologies Used

- **Backend:** Spring Boot
- **Database:** PostgreSQL / H2 (for development)
- **REST API:** Used for communication between client and server
- **Tools:** Spring Tool Suite (STS)
- **Build Tool:** Maven
- **Testing Tools:** Postman for API testing

---

## Prerequisites

- **Java 8+**
- **Maven**
- **PostgreSQL** or **H2** for database
- **Spring Tool Suite** or any IDE that supports Spring Boot

---

## Setup Instructions

1. **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/shopping-mall-management.git
    ```

2. **Navigate to the project directory:**
    ```bash
    cd shopping-mall-management
    ```

3. **Configure the database:**
    - Update the `application.properties` file located in `src/main/resources/` to configure the database.
    - For PostgreSQL:
      ```properties
      spring.datasource.url=jdbc:postgresql://localhost:5432/mall
      spring.datasource.username=your-username
      spring.datasource.password=your-password
      spring.jpa.hibernate.ddl-auto=update
      ```

4. **Build the project using Maven:**
    ```bash
    mvn clean install
    ```

5. **Run the Spring Boot application:**
    ```bash
    mvn spring-boot:run
    ```

6. **Access the application:**
   - The application will be running on `http://localhost:8080`.

---

## API Endpoints

### Store Management
- `GET /api/stores` - Get a list of all stores
- `POST /api/stores` - Add a new store
- `PUT /api/stores/{id}` - Update an existing store
- `DELETE /api/stores/{id}` - Delete a store

### Employee Management
- `GET /api/employees` - Get a list of all employees
- `POST /api/employees` - Add a new employee
- `PUT /api/employees/{id}` - Update an existing employee
- `DELETE /api/employees/{id}` - Delete an employee

### Customer Management
- `GET /api/customers` - Get a list of all customers
- `POST /api/customers` - Add a new customer
- `PUT /api/customers/{id}` - Update an existing customer
- `DELETE /api/customers/{id}` - Delete a customer

### Product Management
- `GET /api/products` - Get a list of all products
- `POST /api/products` - Add a new product
- `PUT /api/products/{id}` - Update an existing product
- `DELETE /api/products/{id}` - Delete a product

---

## Database Configuration

By default, the project uses **H2** for development and **PostgreSQL** for production. You can switch databases by updating the `application.properties` file.

- For **H2** (Development):
    ```properties
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=password
    spring.jpa.hibernate.ddl-auto=update
    spring.h2.console.enabled=true
    ```

---

## Future Enhancements

- **Authentication and Authorization:** Add user authentication and role-based access control.
- **Reporting Module:** Generate reports for mall transactions.
- **Dashboard:** A dashboard for visualizing mall performance data.

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

