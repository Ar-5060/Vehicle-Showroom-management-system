package Projects;

import java.util.Scanner;

public class VehicleShowroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginSystem loginSystem = new LoginSystem();
        ShowroomManagement showroomManagement = new ShowroomManagement();

        System.out.println("--- Vehicle Showroom Management System ---");

        // Register User
        if (!loginSystem.isUserRegistered()) {
            System.out.println("No user found. Please set up your account.");
            System.out.print("Enter a username: ");
            String username = scanner.nextLine();
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();
            loginSystem.registerUser(username, password);
        }

        // Login
        boolean loggedIn = false;
        System.out.println("\nPlease login to continue.");

        while (!loggedIn) {
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            if (loginSystem.login(username, password)) {
                System.out.println("Login successful! Welcome, " + username);
                loggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        // Main Menu
        boolean running = true;
        while (running) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Display Vehicles");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Is the vehicle available (true/false)? ");
                    boolean availability = scanner.nextBoolean();
                    showroomManagement.addVehicle(new Vehicle(id, brand, model, price, availability));
                    break;
                case 2:
                    showroomManagement.displayVehicles();
                    break;
                case 3:
                    System.out.print("Enter vehicle model to search: ");
                    String searchModel = scanner.nextLine();
                    showroomManagement.searchVehicle(searchModel);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
