package assignment3;

import java.util.Scanner;

public class StudentResult {

    int Roll_Number;
    String Name;
    int marks;


    StudentResult(int Roll_Number, String Name, int marks) {

        this.Roll_Number = Roll_Number;
        this.Name = Name;
        this.marks = marks;

        this.display();
    }

    class Result {

        public  void cal_Result() {
            int marks;
            System.out.println("Enter your marks");
            Scanner sc = new Scanner(System.in);
            marks = sc.nextInt();


            if (marks > 80) {
                System.out.println("A grade");
            } else if (marks > 70 && marks < 80) {
                System.out.println("B grade");

            } else if (marks > 40 && marks < 70) {
                System.out.println("C grade");
            } else {
                System.out.println("Fail");
            }


        }
    }


    public void display(){
        System.out.println(Roll_Number+Name+marks);
    }



}
