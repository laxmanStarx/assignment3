package Methods;

public class metthodoverloading {
    static float multiply(float p, float q ){
        float result = p*q;
        return result;
    }

    static int multiply(int p, int q ){
        int results = p*q;
        return results;
    }

    public static void main(String[] args){

        float multiplications = multiply(20.90f, 80.9f);
        System.out.println(multiplications );



        int multiplication = multiply(20, 80);
        System.out.println(multiplication);

    }
}
