//package practise;
//
//
//import java.util.Scanner;
//
//public class Car {
//    int cost;
//    int milage;
//    int numberOfLitres;
//
//    Car(){
//
//        Scanner sc = new Scanner(System.in);
//
//        this.cost = sc.nextInt();
//        this.milage = sc.nextInt();
//        this.numberOfLitres = sc.nextInt();
//
//        this.display();
//
//
//
//    }
//
//
//    public void display(){
//        System.out.println("Your cost " + cost);
//        System.out.println("Milage" + milage);
//        System.out.println("number of Litres" + numberOfLitres);
//    }
//
//
//
////   public class calcMaintain{
////
////        public void calcPerdayPrice() {
////            int price = cost * numberOfLitres;
////
////            System.out.println(price);
////
////        }
////
////
////    }
//}
//
//
//class Company extends Car{
//
//    int quantityProduce;
////    String brandName;
//
//
//    Company(String brandName){
//
//        System.out.println("I m a car compnay");
//
//
//    }
//
//}
//
//
// class CarApp{
//    public static void main(String[] args) {
//
//        Car c1 = new Car();
//        c1.display();
////        Car.calcMaintain b1 = c1.new calcMaintain();
////
////        b1.calcPerdayPrice();
//
//    }
//}



package practise;
import java.util.Scanner;

public class Car {
    int cost, milage, numberOfLitres;

    // 1. Parameterized Constructor: Only assigns values
    Car(int cost, int milage, int numberOfLitres) {
        this.cost = cost;
        this.milage = milage;
        this.numberOfLitres = numberOfLitres;
    }

    public void display() {
        System.out.println("Cost: " + cost + " | Milage: " + milage + " | Litres: " + numberOfLitres);
    }

    // Inner class for maintenance calculation
    public class CalcMaintain {
        public void calcPerdayPrice() {
            int price = cost * numberOfLitres;
            System.out.println("Calculated Maintenance: " + price);
        }
    }
}

class Company extends Car {
    String brandName;

    // 2. Subclass Constructor: Passes data up using super()
    Company(String brandName, int cost, int milage, int litres) {
        super(cost, milage, litres); // Manually calling the parent constructor
        this.brandName = brandName;
        System.out.println("Company created for brand: " + brandName);
    }
}

class CarApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 3. Input logic stays in the App/Main layer
        System.out.println("Enter Car Brand, Cost, Milage, and Litres:");
        String brand = sc.next();
        int c = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();

        // Create the object with collected data
        Company comp = new Company(brand, c, m, l);
        comp.display();

        // Use the inner class
        Car.CalcMaintain maintenance = comp.new CalcMaintain();
        maintenance.calcPerdayPrice();

        sc.close(); // Good practice to close the scanner
    }
}
