package onlineshopping;

import java.util.Scanner;

public class ShoppingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Laptop laptop = new Laptop();

        System.out.println("===== LAPTOP DETAILS =====");

        System.out.print("Enter product name: ");
        laptop.setProductName(sc.nextLine());

        System.out.print("Enter price: ");
        laptop.setPrice(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter brand: ");
        laptop.setBrand(sc.nextLine());

        System.out.print("Enter RAM: ");
        laptop.setRam(sc.nextInt());

        System.out.println("\n--- Product Details ---");

        laptop.displayProductDetails();
        laptop.displayElectronicsDetails();
        laptop.displayLaptopDetails();

        System.out.println("\n===== CLOTHING DETAILS =====");

        Clothing clothing = new Clothing();

        sc.nextLine();

        System.out.print("Enter product name: ");
        clothing.setProductName(sc.nextLine());

        System.out.print("Enter price: ");
        clothing.setPrice(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter size: ");
        clothing.setSize(sc.nextLine());

        System.out.println("\n--- Clothing Details ---");

        clothing.displayProductDetails();
        clothing.displayClothingDetails();

        sc.close();
    }
}
