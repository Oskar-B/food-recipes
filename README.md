# Food Recipes API

This is a **Java Spring Boot** project that provides a backend application with an API for retrieving recipes along with their nutritional facts. Designed with **RESTful principles**, it enables easy integration with frontend applications or other services. 

## Features

- **API for Recipes**: Retrieve recipes and their nutritional information.
- **In-Memory Database**: Uses **H2 Database** for quick and simple data management during development.
- **CRUD Operations**: Supports basic Create, Read, Update, and Delete operations.
- **Spring Boot 3.4.1**: Built using the latest version of Spring Boot.
- **Spring Data JDBC**: Simplifies database access and CRUD functionality.
- **Java 17**: Leverages modern features and performance improvements.
- **Maven**: Handles dependency management and build automation.

## Data

The project uses recipe data from the [Food.com Recipes and User Interactions dataset](https://www.kaggle.com/datasets/shuyangli94/food-com-recipes-and-user-interactions) on Kaggle. 

- The **RAW_recipes.csv** file was cleaned to fit the project's requirements.
- The data is organized into two database tables:
  1. **Recipes Table**: Stores information about the recipes.
  2. **Nutrition Table**: Stores nutritional information for each recipe.

This structure allows efficient querying and management of recipe data and their associated nutritional facts.

## Current Status

🚧 **Work in Progress**  
This project is under active development, with plans to expand functionality in future updates. Currently, only basic CRUD operations are supported.

## Technologies Used

- **Spring Boot 3.4.1**
- **Java 17**
- **H2 Database**
- **Spring Data JDBC**
- **Maven**

## Planned Enhancements

- Add support for advanced query capabilities.
- Implement authentication and authorization.
- Integrate a persistent database (e.g., PostgreSQL or MySQL).
- Enhance error handling and validation.

## License

This project is licensed under the [MIT License](LICENSE).

---

Feel free to contribute, raise issues, or provide feedback! 🚀
