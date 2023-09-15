import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Motorcycle> m = new ArrayList<>();
    static ArrayList<Truck> t = new ArrayList<>();
    static ArrayList<Car> c = new ArrayList<>();

    static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void startingData() {
        m.add(new Motorcycle("Harley-Davidson", "Sportster", 12000, 5, "Yes", 2023));
        m.add(new Motorcycle("Raven X1", "RXT-500", 9999, 10, "No", 2022));
        m.add(new Motorcycle("Viper V2", "VP-750S", 12499, 12, "Yes", 2023));
        m.add(new Motorcycle("Zenith Z5", "ZNX-3000R", 8799, 7, "No", 2020));
        t.add(new Truck("Ford", "F-150", 40000, 9, "OpenTruck", 2017));
        t.add(new Truck("Atlas Prime Mover", "APM-350", 55900, 30, "TrailerTruck", 2019));
        t.add(new Truck("Goliath XL", "GX-5000", 64750, 20, "ContainerTruck", 2021));
        t.add(new Truck("Chevrolet", "Silverado", 38000, 1, "TrailerTruck", 2023));
        c.add(new Car("Toyota", "Camary", 25000, 15, "Sedan", 2022));
        c.add(new Car("Honda", "Civic", 22000, 12, "Sedan", 2023));
        c.add(new Car("Ford", "Mustang", 35000, 8, "SportsCar", 2024));
        c.add(new Car("BMW", "3 Series", 42000, 10, "Sedan", 2024));
    }

    public static void proceed() {
        System.out.println("\nProceeding with the program...");
        input.nextLine();
        clearConsole();
    }

    static void displayVehicles(char choice) {
        System.out.println("Choice: " + choice);
        if (choice == 'A' || choice == 'a') {
            System.out.println("Motorcycles:");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%-5s | %-20s | %-15s | %-10s | %-8s | %-15s | %-10s | %-8s\n", "ID", "Name", "Model", "Price", "Quantity", "BikerClothes", "Taxes", "ManufacturingYear");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            for (Motorcycle motorcycle : m) {
                System.out.printf("%-5s | %-20s | %-15s | $%-9d | %-8d | %-15s | %d%%        | %d\n", motorcycle.getId(), motorcycle.getName(), motorcycle.getModel(), motorcycle.getPrice(), motorcycle.getQuantity(), motorcycle.getFreeBikerClothes(), motorcycle.getTaxes(), motorcycle.getManufacturingYear());
            }
        } else if (choice == 'B' || choice == 'b') {
            System.out.println("Trucks:");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%-5s | %-20s | %-15s | %-10s | %-10s | %-20s | %-10s | %-8s\n", "ID", "Name", "Model", "Price", "Quantity", "Container Type", "Taxes", "ManufacturingYear");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
            for (Truck truck : t) {
                System.out.printf("%-5s | %-20s | %-15s | $%-9d | %-10d | %-20s | %d%%        | %d\n", truck.getId(), truck.getName(), truck.getModel(), truck.getPrice(), truck.getQuantity(), truck.getContainerType(), truck.getTaxes(), truck.getManufacturingYear());
            }
        } else if (choice == 'C' || choice == 'c') {
            System.out.println("Cars:");
            System.out.println("------------------------------------------------------------------------------------------------------------");
            System.out.printf("%-5s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s   | %-15s\n", "ID", "Name", "Model", "Price", "Quantity", "Taxes", "Car Type", "ManufacturingYear");
            System.out.println("------------------------------------------------------------------------------------------------------------");
            for (Car car : c) {
                System.out.printf("%-5s | %-10s | %-10s | %-10d | %-10s | %d%%        | %-10s   | %d\n", car.getId(), car.getName(), car.getModel(), car.getPrice(), car.getQuantity(), car.getTaxes(), car.getCarType(), car.getManufacturingYear());
            }
        } else System.out.println("ERROR!, Invalid choice!");
    }

    static void rentVehicle(int vehicleID, char vehicleChoice, int vehiclePrice) {
        if (vehicleChoice == 'a' || vehicleChoice == 'A') {
            boolean foundMotorcycle = false;
            for (Motorcycle motorcycle : m) {
                if (motorcycle.getId() == vehicleID) {
                    foundMotorcycle = true;
                    if (motorcycle.getQuantity() > 0 && vehiclePrice == motorcycle.getPrice()) {
                        motorcycle.setQuantity(motorcycle.getQuantity() - 1);
                        System.out.println("Motorcycle " + motorcycle.getName() + " with ID: " + motorcycle.getId() + " has been rented successfully!");
                        System.out.println("Remaining Quantity: " + motorcycle.getQuantity());
                        return;
                    } else if (motorcycle.getQuantity() == 0) {
                        System.out.println("No available Quantity was found for Motorcycle: " + motorcycle.getName() + " with ID: " + motorcycle.getId());
                        return;
                    } else if (vehiclePrice != motorcycle.getPrice()) {
                        System.out.println("Incorrect price for Motorcycle: " + motorcycle.getName() + " with ID: " + motorcycle.getId());
                        return;
                    }
                }
            }
            if (!foundMotorcycle) {
                System.out.println("No Motorcycle was found with ID: " + vehicleID);
            }
        }
        if (vehicleChoice == 'b' || vehicleChoice == 'B') {
            boolean foundTruck = false;
            for (Truck truck : t) {
                if (truck.getId() == vehicleID) {
                    foundTruck = true;
                    if (truck.getQuantity() > 0 && vehiclePrice == truck.getPrice()) {
                        truck.setQuantity(truck.getQuantity() - 1);
                        System.out.println("Truck " + truck.getName() + " with ID: " + truck.getId() + " has been rented successfully!");
                        System.out.println("Remaining Quantity: " + truck.getQuantity());
                        return;
                    } else if (truck.getQuantity() == 0) {
                        System.out.println("No available Quantity was found for Truck: " + truck.getName() + " with ID: " + truck.getId());
                        return;
                    } else if (vehiclePrice != truck.getPrice()) {
                        System.out.println("Incorrect price for Truck: " + truck.getName() + " with ID: " + truck.getId());
                        return;
                    }
                }
            }
            if (!foundTruck) {
                System.out.println("No Truck was found with ID: " + vehicleID);
            }
        }
        if (vehicleChoice == 'c' || vehicleChoice == 'C') {
            boolean foundCar = false;
            for (Car car : c) {
                if (car.getId() == vehicleID) {
                    foundCar = true;
                    if (car.getQuantity() > 0 && vehiclePrice == car.getPrice()) {
                        car.setQuantity(car.getQuantity() - 1);
                        System.out.println("Car " + car.getName() + " with ID: " + car.getId() + " has been rented successfully!");
                        System.out.println("Remaining Quantity: " + car.getQuantity());
                        return;
                    } else if (car.getQuantity() == 0) {
                        System.out.println("No available Quantity was found for Car: " + car.getName() + " with ID: " + car.getId());
                        return;
                    } else if (vehiclePrice != car.getPrice()) {
                        System.out.println("Incorrect price for Car: " + car.getName() + " with ID: " + car.getId());
                        return;
                    }
                }
            }
            if (!foundCar) {
                System.out.println("No Car was found with ID: " + vehicleID);
            }
        } else {
            System.out.println("ERROR!, Invalid vehicle choice: " + vehicleChoice);
        }
    }

    static void addVehicle(char choice) {
        if (choice == 'a' || choice == 'A') {
            System.out.println("Enter Moto name: ");
            String vName = input.next();
            if (!vName.matches("[a-zA-Z]+")) { // reason for if is to not run the do while once :p
                do {
                    System.out.println("Please enter a valid name A-Z or a-z");
                    vName = input.next();
                } while (!vName.matches("[a-zA-Z]+"));
            }
            System.out.println("Enter Moto price: ");
            int vPrice = input.nextInt();
            if (vPrice < 5000) {
                do {
                    System.out.println("The price is below *5000*, Please enter a valid price!");
                    vPrice = input.nextInt();
                } while (vPrice < 5000);
            }
            System.out.println("Enter Moto quantity: ");
            int vQuantity = input.nextInt();
            System.out.println("Enter Moto Model: ");
            String vModel = input.next();
            System.out.println("Include free clothes?: ");
            String vFree = input.next();
            if ((!vFree.equals("Yes") && !vFree.equals("No"))) {
                do {
                    System.out.println("Please enter *Yes* or *No* (no asterisk): ");
                    vFree = input.next();
                } while (!vFree.equals("Yes") && !vFree.equals("No"));
            }
            System.out.println("Enter the Manufacturing Year: ");
            int vYear = input.nextInt();
            if (vYear < 2015 || vYear > 2024) {
                do {
                    System.out.println("Please enter a year between 2015 and 2024 (inclusive): ");
                    vYear = input.nextInt();
                } while (vYear < 2015 || vYear > 2024);
            }
            Motorcycle newMotorcycle = new Motorcycle(vName, vModel, vPrice, vQuantity, vFree, vYear);
            m.add(newMotorcycle);
        } else if (choice == 'b' || choice == 'B') {
            System.out.println("Enter Truck name: ");
            String tName = input.next();
            if (!tName.matches("[a-zA-Z]+")) {
                do {
                    System.out.println("Please enter a valid name A-Z or a-z");
                    tName = input.next();
                } while (!tName.matches("[a-zA-Z]+"));
            }
            System.out.println("Enter Truck price: ");
            int tPrice = input.nextInt();
            if ((tPrice < 20000)) {
                do {
                    System.out.println("The price is below *$20000*, Please enter a valid price!");
                    tPrice = input.nextInt();
                } while (tPrice < 20000);
            }
            System.out.println("Enter Truck quantity: ");
            int tQuantity = input.nextInt();
            System.out.println("Enter Truck Model: ");
            String tModel = input.next();
            System.out.println("Enter containerType (OpenTruck,ContainerTruck,TrailerTruck): ");
            String tContainer = input.next();
            if (!tContainer.equals("OpenTruck") && !tContainer.equals("ContainerTruck") && !tContainer.equals("TrailerTruck")) {
                do {
                    System.out.println("Please enter *OpenTruck* or *ContainerTruck* or *TrailerTruck* (no asterisk): ");
                    tContainer = input.next();
                } while (!tContainer.equals("OpenTruck") && !tContainer.equals("ContainerTruck") && !tContainer.equals("TrailerTruck"));
            }
            System.out.println("Enter the Manufacturing Year: ");
            int tYear = input.nextInt();
            if (tYear < 2015 || tYear > 2024) {
                do {
                    System.out.println("Please enter a year between 2015 and 2024 (inclusive byw): ");
                    tYear = input.nextInt();
                } while (tYear < 2015 || tYear > 2024);
            }
            Truck newTruck = new Truck(tName, tModel, tPrice, tQuantity, tContainer, tYear);
            t.add(newTruck);
        } else if (choice == 'c' || choice == 'C') {
            System.out.println("Enter Car name: ");
            String cName = input.next();
            if (!cName.matches("[a-zA-Z]+")) {
                do {
                    System.out.println("Please enter a valid name A-Z or a-z");
                    cName = input.next();
                } while (!cName.matches("[a-zA-Z]+"));
            }
            System.out.println("Enter Car price: ");
            int cPrice = input.nextInt();
            if (cPrice < 20000) {
                do {
                    System.out.println("The price is below *$20000*, Please enter a valid price!");
                    cPrice = input.nextInt();
                } while (cPrice < 20000);
            }
            System.out.println("Enter Car Quantity: ");
            int cQuantity = input.nextInt();
            System.out.println("Enter Car Model: ");
            String cModel = input.next();
            System.out.println("Enter Car Type (SportsCar,Sedan,EV) *No Spaces*: ");
            String cType = input.next();
            if (!cType.equals("SportsCar") && !cType.equals("Sedan") && !cType.equals("EV")) {
                do {
                    System.out.println("Please enter *SportsCar* or *Sedan* or *EV* (no asterisk): ");
                    cType = input.next();
                } while (!cType.equals("SportsCar") && !cType.equals("Sedan") && !cType.equals("EV"));
            }
            System.out.println("Enter the Manufacturing Year: ");
            int cYear = input.nextInt();
            if (cYear < 2015 || cYear > 2024) {
                do {
                    System.out.println("Please enter a year between 2015 and 2024 (inclusive): ");
                    cYear = input.nextInt();
                } while (cYear < 2015 || cYear > 2024);
            }
            Car newCar = new Car(cName, cModel, cPrice, cQuantity, cType, cYear);
            c.add(newCar);
        }
    }

    static void displayMotorcycles() {
        System.out.println("Motorcycles:");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-5s | %-20s | %-15s | %-10s | %-8s | %-15s | %-10s | %-8s\n", "ID", "Name", "Model", "Price", "Quantity", "BikerClothes", "Taxes", "ManufacturingYear");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        for (Motorcycle motorcycle : m) {
            System.out.printf("%-5s | %-20s | %-15s | $%-9d | %-8d | %-15s | %d%%        | %d\n", motorcycle.getId(), motorcycle.getName(), motorcycle.getModel(), motorcycle.getPrice(), motorcycle.getQuantity(), motorcycle.getFreeBikerClothes(), motorcycle.getTaxes(), motorcycle.getManufacturingYear());
        }
    }

    static void displayTrucks() {
        System.out.println("Trucks:");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-5s | %-20s | %-15s | %-10s | %-10s | %-20s | %-10s | %-8s\n", "ID", "Name", "Model", "Price", "Quantity", "Container Type", "Taxes", "ManufacturingYear");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        for (Truck truck : t) {
            System.out.printf("%-5s | %-20s | %-15s | $%-9d | %-10d | %-20s | %d%%        | %d\n", truck.getId(), truck.getName(), truck.getModel(), truck.getPrice(), truck.getQuantity(), truck.getContainerType(), truck.getTaxes(), truck.getManufacturingYear());
        }
    }

    static void displayCars() {
        System.out.println("Cars:");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-5s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s   | %-15s\n", "ID", "Name", "Model", "Price", "Quantity", "Taxes", "Car Type", "ManufacturingYear");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        for (Car car : c) {
            System.out.printf("%-5s | %-10s | %-10s | %-10d | %-10s | %d%%        | %-10s   | %d\n", car.getId(), car.getName(), car.getModel(), car.getPrice(), car.getQuantity(), car.getTaxes(), car.getCarType(), car.getManufacturingYear());
        }
    }

    public static void main(String[] args) {
        startingData();
        int userChoice = 0;
        String carArt = "                                                         _________________________   \n" +
                "                    /\\\\      _____          _____       |   |     |     |    | |  \\  \n" +
                "     ,-----,       /  \\\\____/__|__\\_    ___/__|__\\___   |___|_____|_____|____|_|___\\ \n" +
                "  ,--'---:---`--, /  |  _     |     `| |      |      `| |                    | |    \\\n" +
                " ==(o)-----(o)==J    `(o)-------(o)=   `(o)------(o)'   `--(o)(o)--------------(o)--'  \n"+
                "``````````````````````````Welcome to Vehicle Rental System, coded by Abdullah Hamada``````````````````````````\n";

        System.out.println(carArt);
        while (userChoice != 4) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("Please choose a valid option(1-3)");
            System.out.println("1. View available Vehicles");
            System.out.println("2. Rent a Vehicle");
            System.out.println("3. Add a Vehicle");
            System.out.println("4. Exit");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Your choice---> ");
            try {
                userChoice = input.nextInt();
                input.nextLine();
            } catch (java.util.InputMismatchException e) {
                clearConsole();
                System.out.println("Wow that was an awful input mismatch, Please enter an INTEGER between 1 and 4");
                input.nextLine();
                continue;
            }
            switch (userChoice) {
                case 1 -> {
                    System.out.println("What would you like to view?");
                    System.out.println("A. Motorcycles");
                    System.out.println("B. Trucks");
                    System.out.println("C. Cars");
                    System.out.println("Your input: ");
                    clearConsole();
                    char choice = input.next().charAt(0);
                    displayVehicles(choice);
                    proceed();
                }
                case 2 -> {
                    clearConsole();
                    System.out.println("What would you like to rent?");
                    System.out.println("A. Motorcycle");
                    System.out.println("B. Truck");
                    System.out.println("C. Car");
                    char vehicleChoice = input.next().charAt(0);
                    if (vehicleChoice == 'a' || vehicleChoice == 'A') {
                        displayMotorcycles();
                    } else if (vehicleChoice == 'b' || vehicleChoice == 'B') {
                        displayTrucks();
                    } else if (vehicleChoice == 'c' || vehicleChoice == 'C') {
                        displayCars();
                    }
                    System.out.println("Please enter the desired Vehicle ID: ");
                    int carID = input.nextInt();
                    System.out.println("Enter the desired Vehicle PRICE: ");
                    int vehiclePrice = input.nextInt();
                    rentVehicle(carID, vehicleChoice, vehiclePrice);
                    proceed();
                }
                case 3 -> {
                    clearConsole();
                    System.out.println("What would you like to add?");
                    System.out.println("A. Motorcycle");
                    System.out.println("B. Truck");
                    System.out.println("C. Car");
                    char vChoice = input.next().charAt(0);
                    addVehicle(vChoice);
                    if (vChoice == 'c' || vChoice == 'C') {
                        System.out.println("Your desired *Car* has been added successfully!");
                        displayCars();
                    } else if (vChoice == 'b' || vChoice == 'B') {
                        System.out.println("Your desired *Truck* has been added successfully!");
                        displayTrucks();
                    } else if (vChoice == 'a' || vChoice == 'A') {
                        System.out.println("Your desired *Motorcycle* has been added successfully!");
                        displayMotorcycles();
                    } else System.out.println("That was an invalid choice!");
                    proceed();
                }
                case 4 -> {
                    clearConsole();
                    System.out.println("Terminating System....");
                }
                default -> {
                    clearConsole();
                    System.out.println("Nice try!, but sadly that's an Invalid Choice!");
                    proceed();
                    input.nextLine();
                }
            }
        }
    }
}