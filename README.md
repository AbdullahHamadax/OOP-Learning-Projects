# OOP-Learning-Projects
I will be making simple and concise ( possibly one ) projects in this repo for the purpose of learning OOP concepts.

# Vehicle Rental System

The Vehicle Rental System is a Java-based console application that allows users to view, rent, and add vehicles to a rental inventory. The system is designed to manage three types of vehicles: motorcycles, trucks, and cars. Users can interact with the system through a user-friendly command-line interface.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Screenshots](#screenshots)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Features

- View available motorcycles, trucks, and cars.
- Rent vehicles by specifying the vehicle type, ID, and price.
- Add new vehicles to the inventory with details such as name, model, price, quantity, type, and manufacturing year.
- Validation of user inputs to ensure data integrity.
- Dynamic tax calculation based on the vehicle type.
- User-friendly command-line interface.
- Clear and structured codebase with modular design.

## Prerequisites

- Java Development Kit (JDK)
- Integrated Development Environment (IDE) such as Eclipse, IntelliJ IDEA, or Visual Studio Code

## Getting Started

1. Clone the repository to your local machine:

```bash
git clone https://github.com/AbdullahHamadax/OOP-Learning-Projects.git
```

2. Open the project in your preferred IDE.

3. Run the `Main.java` file to start the Vehicle Rental System.

## Usage

1. Upon launching the application, you will be presented with a menu with the following options:

   - View available vehicles
   - Rent a vehicle
   - Add a vehicle
   - Exit

2. To view available vehicles, select option 1 and choose the vehicle type (A for motorcycles, B for trucks, C for cars).

3. To rent a vehicle, select option 2 and follow the prompts to specify the vehicle type, ID, and price.

4. To add a new vehicle to the inventory, select option 3 and follow the prompts to enter vehicle details.

5. Exit the application by selecting option 4.

## Screenshots

![Main Menu](screenshots/main-menu.png)
![View Available Vehicles](screenshots/view-vehicles.png)
![Rent a Vehicle](screenshots/rent-vehicle.png)
![Add a Vehicle](screenshots/add-vehicle.png)

## Project Structure

The project is organized into the following classes:

- `Main.java`: The main entry point of the application that handles user interactions.
- `Vehicle.java`: An abstract class representing the base class for all vehicle types.
- `Motorcycle.java`: A class representing motorcycle-specific properties and behaviors.
- `Truck.java`: A class representing truck-specific properties and behaviors.
- `Car.java`: A class representing car-specific properties and behaviors.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Make your changes and test them thoroughly.
4. Commit your changes and create a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
