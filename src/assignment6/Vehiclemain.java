package assignment6;



  class Vehicle{

    float speed;
    float fuel;
    Vehicle(float speed,float fuel){
        this.speed = speed;
        this.fuel = fuel;

    }
    public void move(){
        System.out.println("Vehicle is moving");
    }

    public String soundHorn(String sound){

        System.out.println("Bicycle sound is : "+ sound );

        return sound;

//        System.out.println("Ring Ring: " );



    }

}

class Bicycle extends Vehicle{

    Bicycle(float speed, float fuel){
        super(speed, fuel);
    }
    public void move(){
        System.out.println("Pedaling at : "+ speed+ " km/h");
    }



}


class Car extends Vehicle{

    Car(float speed, float fuel){
        super(speed, fuel);
    }
    public void move(){
        System.out.println("Car  is driving at: "  +speed+  " km/h");
        System.out.println(" Car Fuel consumption is :"+ fuel + "litres");
    }

    public String soundHorn(String sound){

        System.out.println(" car sound is  "+ sound );

        return sound;

//        System.out.println(" car sound is  "+ sound );
    }

}

//public class Vehiclemain {
//
//    public static void main(String[] args) {
//
//        Vehicle v1 = new Bicycle(20,0);
//        Vehicle v2 = new Car(80,20);
//
//        v1.move();
//        v2.move();
//        v1.soundHorn("ring ring");
//        v2.soundHorn("beep beep ");
//
//    }
//}
