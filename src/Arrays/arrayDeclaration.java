package Arrays;

public class arrayDeclaration {
    public  static void main(String[] args) {

        int arr[];
        arr = new int[5];
        int brr[] = {1, 290, 3};

        System.out.println(brr[1]);

        int n = brr.length;
//        for(int index = 0; index<=n-1; index++){
//            System.out.println(index);
//        }

        //for Each loop

        for(int val: brr){
            System.out.println(val);
        }

    }

}
