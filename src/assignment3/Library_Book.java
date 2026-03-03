package assignment3;

//Create a class Book with attributes: bookId, title, author, price.

public class Library_Book {

    int bookId;
    String title;
    String author;
    int price;


    Library_Book(int bookId, String title, String author,int price){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;

        this.display();
    }

    public class Library{
        public void Rate_Calculator(){

            float discounted_price = (price/100)*90;
            if(price >1000){
                System.out.println("Your discounted price is: " + discounted_price);
            }
        }
    }

    public  void display(){
        System.out.println("The productId " + bookId);
        System.out.println( "The product Name is " +  title);
        System.out.println("The author would be " + author);
        System.out.println("The price be " + price);
    }


}
