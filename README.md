# food_truck
# Food Truck Finder

## Overview

Food Truck Finder is a web application that allows users to search for and locate food trucks in a city. The application is built using Spring Boot for the backend, PostgreSQL for the database, and a web frontend to display the data.

## Features

- Search for food trucks by name, location, or type
- View detailed information about each food truck
- Display food truck locations on a map

## Technologies Used

- Spring Boot
- PostgreSQL
- Thymeleaf (for server-side rendering)
- Bootstrap (for styling)
- Google Maps API (for map display)

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java 11 or higher
- Maven
- PostgreSQL

## Setup Instructions

### 1. Clone the repository

```sh
git clone https://github.com/yourusername/food-truck-finder.git
cd food-truck-finder

2. Set up the PostgreSQL database
Create a PostgreSQL database and user. You can do this using the following commands:

CREATE DATABASE foodtrucksdb;
CREATE USER yourusername WITH PASSWORD 'yourpassword';
GRANT ALL PRIVILEGES ON DATABASE foodtrucksdb TO yourusername;
spring.datasource.url=jdbc:postgresql://localhost:5432/foodtrucksdb
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3. Build and run the application
mvn clean install
mvn spring-boot:run

Usage
Searching for Food Trucks
Use the search form on the main page to search for food trucks by name, location, or type.
The search results will be displayed in a table, and the locations will be marked on the map.
Viewing Food Truck Details
Click on a food truck in the search results to view more details about the food truck, including its location, schedule, and the types of food it offers.
Contributing
To contribute to Food Truck Finder, follow these steps:

Fork this repository.
Create a branch: git checkout -b feature/your-feature.
Make your changes and commit them: git commit -m 'Add some feature'.
Push to the original branch: git push origin feature/your-feature.
Create the pull request.

Contact
If you want to contact me you can reach me at [daniiarbek.bakirov@yahoo.com].


### Instructions for Use

1. **Clone the Repository**: Clone your project's repository from GitHub.
2. **Set Up the Database**: Follow the instructions to set up the PostgreSQL database and update the `application.properties` file with your database credentials.
3. **Build and Run**: Use Maven to build and run the project.
4. **Search and View**: Use the web application to search for and view food trucks.

### Additional Notes

- **Customization**: You can customize the README file with specific details and links relevant to your project.
- **Contribution Guidelines**: Include any specific contribution guidelines or code of conduct if you have them.

By following these instructions, newcomers will be able to set up, run, and contribute to your project easily.



