package practiseTest;

//Movie Ticket Booking System
//Create a class Movie with attributes: movieName, ticketPrice, numberOfTickets.
//•	Use constructor and this.
//        •	Create inner class TicketBooking.
//        •	Business Logic: Calculate total cost and apply ₹100 discount if tickets > 5.
//        •	main() method in MovieApp.

import java.util.Scanner;

class Movie{
    String movieName;
    int ticketPrice;
    int numberOfTickets;

    Movie(    String movieName,
    int ticketPrice,
    int numberOfTickets){

        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;

    }
    public void displayTicket(){
        System.out.println("movieName is :"+ movieName);
        System.out.println("TicketPrice is: "+ ticketPrice);
        System.out.println("numberOfTickets :" + numberOfTickets);
    }
    class TicketBooking{
        int totalPrice = ticketPrice*numberOfTickets;
        public void calc_Price(){
            if(numberOfTickets> 5){
                System.out.println(totalPrice -100);
            }else{
                System.out.println(totalPrice);
            }

        }
    }
}
public class MovieTicketmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie name");
        String movieName = sc.next();
        System.out.println("Enter ticket Price");
        int ticketPrice = sc.nextInt();
        System.out.println("enter number of tickets");

        int numberOfTickets = sc.nextInt();
        Movie m1 = new Movie(movieName,ticketPrice,numberOfTickets);
        Movie.TicketBooking m2 = m1. new TicketBooking();

        m1.displayTicket();
        m2.calc_Price();

    }
}
