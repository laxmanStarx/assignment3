package practiseTest;

//Create a class Student with attributes: rollNo, name, marks.
//•	Use constructor and this keyword.
//•	Create an inner class Result.
//        •	Business Logic: Calculate grade based on marks (A, B, C, Fail).
//        •	main() method should be in StudentMain.


import java.util.Scanner;

class Student{
    int rollNo;
    String name;
    int marks;
    Student(int rollNo,String name,int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    public void displayStudent(){
        System.out.println("rollNumber: "+ rollNo);
        System.out.println("name: "+ name);
        System.out.println("marks available"+ marks);
    }
    class Result{
        public void showResult(){

            if(marks > 80 ){
                System.out.println("Your marks obtained is : A");
            }else if(marks > 70 && marks <80 ){
                System.out.println("B");
            }else if(marks > 60 && marks < 70){
                System.out.println("C");
            }else{
                System.out.println("Failed");
            }
        }

    }
}








public class StudentResultmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rollNumber = sc.nextInt();
        String name = sc.next();
        int marks = sc.nextInt();

        Student s1 = new Student(rollNumber,name,marks);
        Student.Result r1 = s1.new Result();
        s1.displayStudent();
        r1.showResult();

    }

}
