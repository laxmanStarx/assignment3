package assignment4;


//Problem Statement
//A company has different types of employees.
//Parent Class: Employee
//•	Variables: empId, empName
//•	Method: displayEmployee()
//Child Class 1: Developer
//•	Variable: programmingLanguage
//•	Method: showDeveloperDetails()
//Child Class 2: Tester
//•	Variable: testingTool
//•	Method: showTesterDetails()
//Expected Output
//Employee ID: 201
//Name: Rahul
//Programming Language: Java
//        and
//Employee ID: 301
//Name: Sneha
//Testing Tool: Selenium


class Employee{
    int empId;
    String empName;

    Employee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }



    public void displayEmployee(){

        System.out.println("EmployeeId " + empId);
        System.out.println("empName " + empName);

    }
}


class Developer extends Employee{
    String programmingLanguage;
    Developer(int empId,String empName, String programmingLanguage){
        super(empId, empName);
        this.programmingLanguage = programmingLanguage;
        this.showDeveloperDetails();
    }
    public void showDeveloperDetails(){
        System.out.println("Employee Id :" + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("ProgrammingLanguage" + programmingLanguage);
    }
}
class Tester extends Employee{
    String TestingTool;
    Tester(int empId, String empName,String TestingTool){
        super(empId,empName);



    }
    public void showTesterDetails(){
        System.out.println("Employee Name: " + empName);
        System.out.println("TestingTool: " + TestingTool);
    }
}



public class EmployeeSystem {

    public static void main(String[] args) {


        Developer d1 = new Developer(201, "Ram", "JAVA");

        Tester t1 = new Tester(2002, "Lakshman", "Selenium");

        d1.showDeveloperDetails();
        t1.showTesterDetails();


    }



}
