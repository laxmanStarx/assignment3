package practise;


import java.util.Scanner;

public class ArrayManagement
{
    static Scanner sc = new Scanner(System.in);



    public static void createArray()
    {
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }




        System.out.println("array Created");
    }

    public static void iterateArrayElement()
    {

        System.out.println("array elements are iterated");
    }

    public static void findMax()
    {




        createArray();








        System.out.println("max value is found");

    }

    public static void updateArrayElement()
    {
        System.out.println("array elements are updated");

    }







}
