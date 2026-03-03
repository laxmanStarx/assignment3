package assignment3;

import java.util.Scanner;
//bookId, title, author, price.

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bookId = sc.nextInt();
        String title = sc.next();
        String author = sc.next();
        int price = sc.nextInt();

        Library_Book b1 = new Library_Book(bookId,title,author,price);
        Library_Book.Library c1 = b1.new Library();

        c1.Rate_Calculator();


    }
}
