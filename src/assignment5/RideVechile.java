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
    double totalfare;
    long costperkm = 400;

    BikeRide(  String rideDetails,
    String passengerName,

    int rideId){
        super(rideId, passengerName);

        this.rideDetails = rideDetails;
        this.passengerName = passengerName;
                this.totalfare = totalfare;



    }

    public void calculateFare(double distance){
        totalfare = (long)(distance*costperkm);
        System.out.println("rideId: "+ rideId);
        System.out.println("passengerName: "+ passengerName);



        System.out.println("totalfare: "+totalfare );
        System.out.println("rideDetails: " + rideDetails);
        System.out.println("distance: " + distance);
    }

}

class CabRide extends Ride{
//    int rideId;
//    String passengerName;
    String rideDetails;

    long distanceTravelled;
//    long totalfare = distanceTravelled*costperkm;
    long costperkm = 40;
    long totalfare = distanceTravelled*costperkm;



    CabRide(  String rideDetails,
               String passengerName,

               int rideId){
        super(rideId, passengerName);

//        this.rideId = rideId;
//        this.passengerName = passengerName;

        this.rideDetails = rideDetails;





    }

    public void calculateFare(double distance){

        totalfare = (long)(distance*costperkm);
        System.out.println("rideId: "+ rideId);
        System.out.println("passengerName: "+ passengerName);

        System.out.println("distance travelled "+ distance);
        System.out.println( "total fare :"+ totalfare  );
        System.out.println("rideDetails: " + rideDetails);
    }

}



class AutoRide extends Ride{

    String rideDetails;
//    String passengerName;

    double totalfare;
    double costperkm = 320;



    AutoRide(  String rideDetails,
              String passengerName,

               int rideId){
        super(rideId, passengerName);

        this.rideDetails = rideDetails;
        this.passengerName = passengerName;




    }

    public void calculateFare(double distance){
        System.out.println("rideId: "+ rideId);
        System.out.println("passengerName: "+ passengerName);
        System.out.println("distance: "+ distance);

        System.out.println(totalfare = distance*costperkm);
        System.out.println("rideDetails: " + rideDetails);
    }

}

public class RideVechile {

    public static void main(String[] args) {
        Ride r1 = new BikeRide("BikeRider","lakshman",2345);
        Ride r2 = new CabRide("CabDriver","Ramesh",6890);
        Ride r3 = new AutoRide("AutoDriver","Harita",9087);

        r1.calculateFare(689);
        r2.calculateFare(7896);
        r3.calculateFare(777);
    }


}
