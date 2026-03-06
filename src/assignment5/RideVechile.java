package assignment5;

//Design a superclass Ride with the following instance variables:
//        •	rideId
//•	passengerName
//The superclass should contain a method calculateFare(double distance).
//Create the following subclasses:
//        •	BikeRide
//•	CabRide
//•	AutoRide
//Requirements:
//        •	Each subclass should override the calculateFare() method.
//        •	Each ride type should implement different fare calculation logic.
//•	Display ride details, passenger name, distance travelled, and total fare.


class Ride{
    int rideId;
    String passengerName;

    Ride(int rideId, String passengerName){
        this.rideId = rideId;
        this.passengerName = passengerName;
    }
    public void calculateFare(double distance){
        System.out.println("rideId: "+ rideId);
        System.out.println("passengerName: "+ passengerName);
        System.out.println("distance: "+ distance);
    }
}

class BikeRide extends Ride{
//    int rideId;
//    String passengerName;
    String rideDetails;

    long distanceTravelled;
    int totalfare;

    BikeRide(  String rideDetails,
    String passengerName,
    long distanceTravelled,
    int totalfare,int rideId){
        super(rideId, passengerName);

        this.rideDetails = rideDetails;
        this.passengerName = passengerName;
                this.totalfare = totalfare;
                this.distanceTravelled = distanceTravelled;


    }

    public void calculateFare(double distance){
        System.out.println("rideId: "+ rideId);
        System.out.println("passengerName: "+ passengerName);

        System.out.println(distanceTravelled);
        System.out.println(totalfare);
        System.out.println("rideDetails: " + rideDetails);
    }

}

class CabRide extends Ride{
//    int rideId;
//    String passengerName;
    String rideDetails;

    long distanceTravelled;
    int totalfare;



    CabRide(  String rideDetails,
               String passengerName,
               long distanceTravelled,
               int totalfare,int rideId){
        super(rideId, passengerName);

//        this.rideId = rideId;
//        this.passengerName = passengerName;

        this.rideDetails = rideDetails;
        this.totalfare = totalfare;
        this.distanceTravelled = distanceTravelled;


    }

    public void calculateFare(double distance){
        System.out.println("rideId: "+ rideId);
        System.out.println("passengerName: "+ passengerName);

        System.out.println(distanceTravelled);
        System.out.println(totalfare);
        System.out.println("rideDetails: " + rideDetails);
    }

}



class AutoRide extends Ride{

    String rideDetails;
    String passengerName;
    long distanceTravelled;
    int totalfare;



    AutoRide(  String rideDetails,
              String passengerName,
              long distanceTravelled,
              int totalfare,int rideId){
        super(rideId, passengerName);

        this.rideDetails = rideDetails;
        this.passengerName = passengerName;
        this.totalfare = totalfare;
        this.distanceTravelled = distanceTravelled;


    }

    public void calculateFare(double distance){
        System.out.println("rideId: "+ rideId);
        System.out.println("passengerName: "+ passengerName);
        System.out.println("distance: "+ distance);
        System.out.println(distanceTravelled);
        System.out.println(totalfare);
        System.out.println("rideDetails: " + rideDetails);
    }

}

public class RideVechile {

    public static void main(String[] args) {
        Ride r1 = new BikeRide("BikeRider","lakshman",60,600,2345);
        Ride r2 = new CabRide("CabDriver","Ramesh",860,600,6890);
        Ride r3 = new AutoRide("AutoDriver","Harita",560,500,5890);

        r1.calculateFare(6789);
        r2.calculateFare(7896);
        r3.calculateFare(77897);
    }


}
