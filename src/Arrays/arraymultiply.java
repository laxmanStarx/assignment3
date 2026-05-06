package Arrays;

public class arraymultiply {
    public static void main(String[] args){
        int multiply = 1;
        int arr[] = {2,60,8,10};
        for(int i = 0;i<arr.length; i++){
            multiply = arr[i] * multiply;
        }
        System.out.println(multiply);
    }
}
