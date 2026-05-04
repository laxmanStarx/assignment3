package Methods;

public class metthodoverloading {
    static float multiply(float p, float q ){
        float result = p*q;
        return result;
    }

    public static void main(String[] args){

        float multiplication = multiply(20.90f, 80.9f);
        System.out.println(multiplication);

    }
}
