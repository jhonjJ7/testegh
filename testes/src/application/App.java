package application;

import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();

        p.setName(name);
        p.setPrice(price);

        System.out.println("product data: " + p);

        System.out.println("enter the number of products to be added in stock: ");
        p.AddProduct(sc.nextInt());

        System.out.println("updated data: " + p);

        System.out.println("enter the number of products to be removed in stock: ");
        p.RemoveProduct(sc.nextInt());

        System.out.println("updated data: " + p);

    }
}
