package assignment6;

//Scenario:Different buildings consume power differently.
//9.The Power Plug:Create an interface PowerConsumer with a method consumeEnergy(int watts).
//        10.The Mall vs. The House:Create a ShoppingMall class and a TinyHouse class. Both must implement PowerConsumer.
//        11.Usage Logic:In ShoppingMall, if watts > 1000, print "High usage warning!" In TinyHouse, just print "Powering the lights."
//        12.The Abstract Foundation:Create an abstract class Building with a field address. Make ShoppingMall extend Building andimplement PowerConsumer.


interface PowerConsumer{
      void consumeEnergy(int watts);

}

abstract class Building{
    String address;
    Building(String address){
        this.address = address;
    }



}







class ShoppingMall extends Building implements PowerConsumer{
//    ShoppingMall(int watts);
//    super(int watts);
//    int watts;
//    if(watts > 1000){
//        System.out.println("Highest useage warning");
//    }

    ShoppingMall(String address){
        super(address);
    }

    @Override
    public void consumeEnergy(int watts) {

        if(watts > 1000){
            System.out.println("Highest useage warning");

        }else{
            System.out.println("Mall energy usuage normal");
        }

    }
}

class TinyHouse implements  PowerConsumer{
    public void consumeEnergy(int watts){
        System.out.println("Powering the lights");
    }
}





public class CityPowerGridmain {
    public static void main(String[] args) {

        PowerConsumer mall = new ShoppingMall(("MG Road"));
        PowerConsumer house = new TinyHouse();

        mall.consumeEnergy(1500);
        house.consumeEnergy(2000);

    }
}
