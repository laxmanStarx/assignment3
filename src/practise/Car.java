package practise;


import java.util.Scanner;

public class Car {
    int cost;
    int milage;
    int numberOfLitres;

    Car(){

        Scanner sc = new Scanner(System.in);

        this.cost = sc.nextInt();
        this.milage = sc.nextInt();
        this.numberOfLitres = sc.nextInt();

        this.display();



    }


    public void display(){
        System.out.println("Your cost " + cost);
        System.out.println("Milage" + milage);
        System.out.println("number of Litres" + numberOfLitres);
    }



   public class calcMaintain{

        public void calcPerdayPrice() {
            int price = cost * numberOfLitres;

            System.out.println(price);

        }


    }
}


 class CarApp{
    public static void main(String[] args) {

        Car c1 = new Car();
        Car.calcMaintain b1 = c1.new calcMaintain();

        b1.calcPerdayPrice();

    }
}
