package com.main;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Methods method = new Methods();
        do {
            System.out.println("1: Add");
            System.out.println("2: Remove");
            System.out.println("3: Update");
            System.out.println("4: Show");
            System.out.println("5: File");
            System.out.println("6. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Id: ");
                    int idAdd = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter made: ");
                    String made = scanner.nextLine();
                    System.out.println("Enter price: ");
                    long price = Long.parseLong(scanner.nextLine());
                    System.out.println("Enter description: ");
                    String desc = scanner.nextLine();
                    Product product = new Product(idAdd, name, made, price, desc);
                    method.addNew(product);
                    break;
                case 2:
                    System.out.println("Enter id product: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    method.remove(id);
                    break;
                case 3:
                    System.out.println("Enter id: ");
                    int idUpdate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter name: ");
                    String nameUpdate = scanner.nextLine();
                    System.out.println("Enter made: ");
                    String madeUpdate = scanner.nextLine();
                    System.out.println("Enter price: ");
                    long priceUpdate = Long.parseLong(scanner.nextLine());
                    System.out.println("Enter description: ");
                    String decsUpdate = scanner.nextLine();
                    Product productUpdate = new Product(idUpdate, nameUpdate, madeUpdate, priceUpdate, decsUpdate);
                    method.updateProduct(productUpdate);
                    break;
                case 4:
                    File file = new File("demo.txt");
                    if(!file.exists()){
                        System.out.println("Chua tao file");
                    }

                    method.showInfo(file);
                    break;
                case 5:
                    method.writeToFile(Methods.arrProduct);
                    break;
                case 6:
                    System.out.println("See you again!");
                    System.exit(0);
            }
        } while (true);
    }
}
