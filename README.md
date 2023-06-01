# RestaurantAssistant

The purpose of the restaurant assistant project is to develop a web/mobile application that facilitates and streamlines the interaction between restaurant clients and staff. The application aims to enhance the overall dining experience by providing convenient features for clients, while also offering management tools for restaurant administrators.
For clients, the application allows them to easily scan a QR code assigned to their table, which registers them as seated. This eliminates the need for manual table assignment and helps the restaurant keep track of occupied tables. Clients can then access various options and services directly through the application. In Phase 1, clients can request assistance from waitstaff, ask for a menu, and request the bill. In Phase 2, they can view the menu on their mobile devices, complete with dish names, pictures, and language options, and place orders directly through the application.

## Table of Contents
* #### Features
* #### Softwares
* #### Installation
* #### Usage
* #### Contributing
* #### License

### Features
* Call a waiter for assistance.
* Request a menu.
* Request the bill.
* The menu is available in different languages


#### Reservation Management:
Efficiently handle customer reservations, track availability, and send notifications.
#### Order Management:
Keep track of customer orders, manage menu items, and generate bills.
#### Table Management:
Assign and track table occupancy, optimize seating arrangements, and manage waitlists.
Inventory Management:
Manage restaurant inventory, track stock levels, and receive alerts for low stock items.
#### Staff Management:
Maintain employee records, track shifts, and manage roles and permissions.
#### Reporting and Analytics:
Generate reports on sales, revenue, and other key metrics to gain insights into the business.
Prerequisites

**Before running Restaurant Assistant, ensure you have the following prerequisites installed:**

### Softwares

* Docker
* Java Development Kit (JDK) 20
* Apache Maven
* MSSQL 

### Installation

1. Clone the repository:

 git clone https://github.com/georgedobrev/Restaurant_Assistant.git

2. Navigate to the project directory:

 cd restaurant-assistant

3. Build the project using Maven:

mvn clean install

4. Install Docker 
5. Write 'docker-compose up' on the console
6. Connecting to the DataBase using username and password
7. Write 'CREATE DATABASE restaurant_assistant' in create_database.sql 

### Configuration
**Configure the database connection in src/main/resources/application.properties.**

Run the project:

> mvn spring-boot:run
> 
Access the application in your browser at http://localhost:8080.

##### Usage
Navigate to the homepage of the Restaurant Assistant application.

Create an account or log in with your existing credentials.

Explore the different features and functionalities available in the application.

Follow the on-screen instructions and tooltips to make the most of the Restaurant Assistant.

#### Contributing
We welcome contributions to the Restaurant Assistant project. To contribute, please follow these steps:

1. Clone the repository.

2. Create a new branch:

 > git checkout -b my-feature-branch

3. Make your changes and commit them:

> git commit -m "Add new feature"

4. Push your changes to your forked repository:

 > git push origin my-feature-branch

5. Open a pull request to the main repository.

#### License
This project is licensed under the MIT License.
  
