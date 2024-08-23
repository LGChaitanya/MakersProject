Overview
Makersharks Search API is a Spring Boot application designed to search for manufacturers based on location, nature of business, and manufacturing process. This API helps users find manufacturers with specific capabilities and business scales.

Features
Search Manufacturers: Retrieve a list of manufacturers based on their location, nature of business, and manufacturing process.
Customizable Queries: Filter manufacturers by various criteria.

Getting Started
Prerequisites
Java: Version 17 
Maven: For building the project
MySQL: Database for storing supplier information

Installation
1. Clone the Repository:
bash
git clone https://github.com/LGChaitanya/MakersProject.git

2.Navigate to the Project Directory:
bash
cd MakersProject

3.Configure Database:
Update the application.properties file in src/main/resources with your MySQL database credentials.

4.Build the Project:
bash
mvn clean install

5. Run the Application:
bash
mvn spring-boot:run

API Endpoints

Query Suppliers

Endpoint: /api/supplier/query
Method: POST
Description: Fetch a list of suppliers based on the provided search criteria.

Request Parameters

location (String) - The location to filter suppliers.
natureOfBusiness (NatureOfBusiness) - The nature of business (e.g., SMALL_SCALE, MEDIUM_SCALE, LARGE_SCALE).
manufacturingProcess (ManufacturingProcess) - The manufacturing process (e.g., MOULDING, 3D_PRINTING, CASTING, COATING).


Contributing
Contributions are welcome! Please fork the repository and submit a pull request with your changes.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
For any questions, please contact chaitanyalg117@gmail.com.
