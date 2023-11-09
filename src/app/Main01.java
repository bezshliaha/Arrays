package app;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number of products: ");
        int position = scanner.nextInt();
        scanner.nextLine();

        String[] products = new String[position];
        int itemCount = 0;

        while (true) {
            System.out.println("Make your choice:\n" +
                               "1) Add a product\n" +
                               "2) Display the list of products\n" +
                               "3) Search for an product\n" +
                               "4) Exit\n");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (itemCount < position) {
                        System.out.print("Enter the item name: \n");
                        String item = scanner.nextLine();
                        products[itemCount] = item;
                        itemCount++;
                        System.out.println("Product added.\n");
                    } else {
                        System.out.println("The shopping list is already full :(\n");
                    }
                    break;
                case 2:
                    System.out.println("Shopping list:\n");
                    for (int i = 0; i < itemCount; i++) {
                        System.out.println((i + 1) + ") " + products[i] + "\n");
                    }
                    break;
                case 3:
                    System.out.print("Enter the product name to search for: ");
                    String searchItem = scanner.nextLine();
                    boolean found = false;
                    System.out.println("Search results: " + searchItem + "':");
                    for (int i = 0; i < itemCount; i++) {
                        if (products[i].equalsIgnoreCase(searchItem)) {
                            System.out.println((i + 1) + ") " + products[i] + "\n");
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Product not found." + "\n");
                    }
                    break;
                case 4:
                    System.out.println("Programme has been completed." + "\n");
                    System.exit(0);
                default:
                    System.out.println("Incorrect choice, please try again.");
            }
        }
    }
}