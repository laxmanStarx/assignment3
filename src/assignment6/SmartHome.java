package assignment6;

//
//Scenario:A "Smart Home" isn't a type of Light; it containsLights.
// 17.The Components:Create a LightBulb class with isOn (boolean) and toggle() methods.
// 18.The Assembly:Create a SmartRoom class. Inside it, declare private LightBulb roomLight.
// 19.The Connection:In the SmartRoom constructor, initialize the roomLight. Create a pressWallSwitch() method in SmartRoom that calls roomLight.toggle().
// 20.The Expansion:Add a Speaker object to the SmartRoom. Create a partyMode() method that turns on the light and plays music at the same time


class LightBulb {

    boolean isOn;

    LightBulb(boolean isOn) {
        this.isOn = isOn;
    }

    boolean toggle() {
        isOn = !isOn;
        System.out.println("Light is now " + (isOn ? "ON" : "OFF"));
        return isOn;
    }
}
    class Speaker{
        void playMusic(){
            System.out.println("Speaker is playing music");
        }
    }


class SmartRoom {
    private  LightBulb roomLight;
    private  Speaker speaker;
    SmartRoom( ){
        roomLight = new LightBulb(false);
        speaker = new Speaker();
    }

     boolean pressWallSwitch(){
         return roomLight.toggle();

    }
    void partyMode(){
        System.out.println("Party Mode Activated!");
        roomLight.toggle();
        speaker.playMusic();
    }
}

















//public class SmartHome {
//    public static void main(String[] args) {
//        SmartRoom room = new SmartRoom();
//        room.pressWallSwitch();
//        room.pressWallSwitch();
//
//        room.partyMode();
//
//    }
//}
