# URL-HIT-Counter

## Overview
This project is a Java Spring Boot application that provides a simple API for tracking visitor counts.

# Language and Framework
- Java Spring Boot

## Description
Java-based application built using the Spring Boot framework. The Visitor Count API allows users to manage visitor counts and related information through a set of RESTful endpoints. It includes features such as adding new visitors, retrieving visitor counts, and more.

# Endpoints
## Get Total Hit Count
- **HTTP Method:** GET
- **Endpoint:** /count
- **Description:** Retrieves the total hit count for the default URL.

## Get Hit Count for a Specific User
- **HTTP Method:** GET
- **Endpoint:** /api/v1/username/{username}/count
- **Description:** Retrieves the hit count for a specific user identified by {username}.

## Increase Total Count
- **HTTP Method:** POST
- **Endpoint:** /api/v1/visitor-count-app
- **Description:** Increase the total visitor count by 1.

## Increment Hit Count for a Specific User
- **HTTP Method:** POST
- **Endpoint:** /api/v1/count_update/username/{username}/count
- **Description:** Increments the hit count for a specific user identified by {username}. If the user doesn't exist, it creates the user with the given username and assigns count 1.

# Project Structure
The project is organized into several parts:

- **Entities:** Contains the data model for visitors and their hit counts.
- **Controllers:** Defines the API endpoints and maps them to service methods.
- **Services:** Implements the business logic for the API endpoints.
- **Repository:** Implements the database (HashMap) and data management logic.
