import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Motorcycle> m = new ArrayList<>();
    static ArrayList<Truck> t = new ArrayList<>();

    static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void initialData() {
        m.add(new Motorcycle("Harley-Davidson", "Sportster", 12000, 5,"FreeBikerClothes"));
        m.add(new Motorcycle("Raven X1", "RXT-500", 9999, 10, "FreeBikerClothes"));
        m.add(new Motorcycle("Viper V2", "VP-750S", 12499, 12, "NoBikerClothes"));
        m.add(new Motorcycle("Zenith Z5", "ZNX-3000R", 8799, 7, "NoBikerClothes"));
        t.add(new Truck("Ford", "F-150", 40000, 9, "OpenTruck"));
        t.add(new Truck("Atlas Prime Mover", "APM-350", 55900, 30,"TrailerTruck"));
        t.add(new Truck("Goliath XL", "GX-5000", 64750, 20,"ContainerTruck"));
        t.add(new Truck("Chevrolet", "Silverado", 38000, 1,"TrailerTruck"));
    }

    public static void proceed() {
        System.out.println("\nProceeding with the program...");
        input.nextLine();
        clearConsole();
    }

    static void displayVehicles(char choice) {
        System.out.println("Choice: " + choice);
        if (choice == 'A' || choice == 'a') {
            System.out.println("Motorycles:");
            System.out.println("----------------------------------------------------------------------");
            System.out.printf("%-5s | %-20s | %-15s | %-10s | %-8s\n", "ID", "Name", "Model", "Price", "Quantity");
            System.out.println("----------------------------------------------------------------------");
            for (Motorcycle motorcycle : m) {
                System.out.printf("%-5s | %-20s | %-15s | $%-9d | %-8d\n", motorcycle.getId(), motorcycle.getName(), motorcycle.getModel(), motorcycle.getPrice(), motorcycle.getQuantity());
            }
        } else if (choice == 'B' || choice == 'b') {
            System.out.println("Trucks:");
            System.out.println("----------------------------------------------------------------------");
            System.out.printf("%-5s | %-20s | %-15s | %-10s | %-8s\n", "ID", "Name", "Model", "Price", "Quantity");
            System.out.println("----------------------------------------------------------------------");
            for (Truck truck : t) {
                System.out.printf("%-5s | %-20s | %-15s | $%-9d | %-8d\n", truck.getId(), truck.getName(), truck.getModel(), truck.getPrice(), truck.getQuantity());
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
        } else if (vehicleChoice == 'b' || vehicleChoice == 'B') {
            boolean foundTruck = false;
            for (Truck truck : t) {
                if (truck.getId() == vehicleID) {
                    foundTruck = true;
                    if (truck.getQuantity() > 0) {
                        truck.setQuantity(truck.getQuantity() - 1);
                        System.out.println("Truck " + truck.getName() + " with ID: " + truck.getId() + " has been rented successfully!");
                        return;
                    } else {
                        System.out.println("No available Quantity was found for Truck: " + truck.getName() + " with ID: " + truck.getId());
                        return;
                    }
                }
            }
            if (!foundTruck) {
                System.out.println("No Truck was found with ID: " + vehicleID);
            }
        } else {
            System.out.println("ERROR!, Invalid vehicle choice: " + vehicleChoice);
        }
    }


    public static void main(String[] args) {
        initialData();
        int userChoice = 0;
        while (userChoice != 3) {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Please choose a valid option(1-3)");
            System.out.println("1. View available Vehicles");
            System.out.println("2. Rent a Vehicle");
            System.out.println("3. Exit");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Your choice:");
            try {
                userChoice = input.nextInt();
                input.nextLine();
            } catch (java.util.InputMismatchException e) {
                clearConsole();
                System.out.println("Wow that was an awful input mismatch, Enter an INTEGER.");
                input.nextLine();
                continue;
            }
            switch (userChoice) {
                case 1 -> {
                    System.out.println("What would you like to view?");
                    System.out.println("A. Motorcycles");
                    System.out.println("B. Trucks");
                    System.out.println("Your input:");
                    clearConsole();
                    char choice = input.next().charAt(0);
                    displayVehicles(choice);
                    proceed();
                    break;
                }
                case 2 -> {
                    clearConsole();
                    System.out.println("What would you like to rent?");
                    System.out.println("A. Motorcycle");
                    System.out.println("b. Trucks");
                    char vehicleChoice = input.next().charAt(0);
                    System.out.println("Please enter the desired Vehicle ID");
                    int carID = input.nextInt();
                    System.out.println("Enter the desired Vehicle PRICE");
                    int vehiclePrice = input.nextInt();
                    rentVehicle(carID, vehicleChoice,vehiclePrice);
                    proceed();
                }
                case 3 -> {
                    clearConsole();
                    System.out.println("Terminating System....");
                }
                default -> {
                    System.out.println("Nice try!, but sadly that's an Invalid Choice!");
                    input.nextLine();
                    clearConsole();
                    proceed();
                    break;
                }
            }
        }
    }
}