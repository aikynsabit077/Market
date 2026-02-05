package store;

import model.*;
import exception.InvalidInputException;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreConsoleManager implements StoreConsole {

    private final ArrayList<Product> products = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void displayMenu() {
        System.out.println("\n===== STORE =====");
        System.out.println("1) View Products");
        System.out.println("2) Add Product");
        System.out.println("0) Exit");
        System.out.print("Choice: ");
    }

    @Override
    public void run() {
        boolean running = true;

        while (running) {
            displayMenu();
            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> showProducts();
                    case 2 -> addProduct();
                    case 0 -> running = false;
                    default -> throw new InvalidInputException("Wrong menu choice");
                }

            } catch (InvalidInputException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Input error!");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    private void showProducts() {
        if (products.isEmpty()) {
            System.out.println("No products.");
            return;
        }
        for (Product p : products) {
            System.out.println(p);
        }
    }

    private void addProduct() {
        System.out.println("1) Fresh");
        System.out.println("2) Packaged");
        System.out.print("Type: ");
        int type = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        int id = products.size() + 1;

        if (type == 1) {
            System.out.print("Days to expire (as text, e.g. '2026-10-10'): ");
            String expiryDate = scanner.nextLine();
            products.add(new FreshProduct(name, price, stock, "Fresh Food", expiryDate));
        } else if (type == 2) {
            System.out.print("Brand:");
            String brand = scanner.nextLine();
            products.add(new PackagedProduct(name, price, stock, "Packaged", brand));
        } else {
            throw new IllegalArgumentException("Unknown product type");
        }

        System.out.println("Product added!");
    }
}
