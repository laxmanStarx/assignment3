package Arrays;

public class maxElement {
    public static void main(String[] args){
        int arr[] = {89, 70, -400,40,60};
        int maxElement = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > maxElement ){
                maxElement = arr[i];
            }
        }
        System.out.println(maxElement);
    }
}
