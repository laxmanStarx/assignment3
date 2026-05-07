package Casting;

public class WideningCasting {
    public static void main(String[] args){
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        //NarrowCasting
        double myDoubles = 9.79d;
        int myInts = (int) myDoubles;

        System.out.println(myDoubles);
        System.out.println(myInts);
    }
}
