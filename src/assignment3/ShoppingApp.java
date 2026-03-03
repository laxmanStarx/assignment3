package assignment3;

import java.util.Scanner;

public class ShoppingApp {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product ID:");
        int id = sc.nextInt();

        System.out.println("Enter Product Name:");
        String name = sc.next();

        System.out.println("Enter Price:");
        int price = sc.nextInt();

        System.out.println("Enter Quantity:");
        int quantity = sc.nextInt();

        ShoppingCart s1 = new ShoppingCart(id, name, price, quantity);

        s1.display();

        ShoppingCart.Cart c1 = s1.new Cart();
        c1.billtotal();

    }
}
