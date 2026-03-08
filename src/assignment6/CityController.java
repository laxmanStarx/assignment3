package assignment6;

public class CityController {



    public static void main(String[] args) {

        Vehicle v1 = new Bicycle(20,0);
        Vehicle v2 = new Car(80,20);

        v1.move();
        v2.move();
        v1.soundHorn("ring ring");
        v2.soundHorn("beep beep ");


        SmartRoom room = new SmartRoom();
        room.pressWallSwitch();
        room.pressWallSwitch();

        room.partyMode();




    }
}

