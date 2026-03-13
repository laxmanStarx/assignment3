package practiseTest;
//Electricity Bill Generator
//Create a class ElectricityConnection with attributes: consumerId, consumerName, unitsConsumed.
//•	Use constructor and this.
//        •	Create inner class BillCalculator.
//        •	Business Logic:
//o	First 100 units → ₹5/unit
//o	Next 100 units → ₹7/unit
//o	Above 200 units → ₹10/unit
//•	main() method in ElectricityApp.

import java.util.Scanner;

class ElectricityConnection{
    int consumerId;
    String consumerName;
    int unitsConsumed;
    ElectricityConnection(int consumerId, String consumerName, int unitsConsumed){
        this.consumerId = consumerId;
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }
    public void displayuserDetails(){
        System.out.println("consumerId: "+ consumerId);
        System.out.println("consumerName"+ consumerName);
        System.out.println("unitsConsumed"+ unitsConsumed);
    }
    class BillCalculator{
        public void billing(){
//            Scanner sc = new Scanner(System.in);
//            int noOfunits = sc.nextInt();
            if(unitsConsumed > 0 && unitsConsumed  <=100){
                System.out.println("cost of units be "+ unitsConsumed *5);
            }else if(unitsConsumed  > 100 && unitsConsumed  <=200){
                System.out.println("cost of units be : "+ unitsConsumed *7);
            }else {
                System.out.println("cost of units be: "+ unitsConsumed *10);
            }
        }
    }
}



















public class Electricitybillmain {

    public static void main(String[] args) {
        ElectricityConnection  g1 = new ElectricityConnection(101,"Rajesh", 500);
        ElectricityConnection.BillCalculator b1 = g1.new BillCalculator();
        g1.displayuserDetails();
        b1.billing();

    }
}
