package assignment6;

import javax.xml.namespace.QName;

class Citizen{
    private String name;
    private int age;
    private int voterId;
    private String password;

    private static  int citizenCount = 1;
    Citizen(String name, int age, String password) {
        this.name = name;
        setAge(age);
        this.password = password;

        this.voterId = citizenCount;
        citizenCount++;
    }


    public void setAge(int a){
        if(a < 0){
            System.out.println("Error: Age cannot be negative");
        }
        this.age = a;
    }
    public void changePassword(String oldPass, String newPass){

        if(password.equals(oldPass)){
            password = newPass;
            System.out.println("Password updated successfully");
        }
        else{
            System.out.println("Incorrect old password");
        }
    }


    public void displayCitizen(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Voter ID: " + voterId);
    }


}


public class JavaCity {

    public static void main(String[] args) {

        Citizen c1 = new Citizen("Rahul", 25, "abc123");
        Citizen c2 = new Citizen("Amit", 30, "pass456");

        c1.displayCitizen();
        c2.displayCitizen();

        c1.setAge(-5);

        c1.changePassword("abc123", "newpass");

        c1.changePassword("wrongpass", "test");



    }
}
