package practiseTest;
//Create a class PolicyHolder with attributes: policyNumber, name, age, sumAssured.
//•	Initialize using constructor and this.
//        •	Create inner class PremiumCalculator.
//        •	Business Logic:
//o	Age < 30 → 2% of sum assured
//o	Age 30–50 → 3%
//o	Above 50 → 5%
//        •	main() method in InsuranceApp.


import java.util.Scanner;

class PolicyHolder{
    long policyNumber;
    String name;
    int age;
    int sumAssured;
    PolicyHolder(long policyNumber, String name,int age, int sumAssured){
        this.policyNumber = policyNumber;
        this.name = name;
        this.age = age;
        this.sumAssured = sumAssured;
    }
    public void displayHolder(){
        System.out.println(policyNumber);
        System.out.println(name);
        System.out.println(age);

    }
    class PremiumCalculator{
      public void calc_Scheme(){
          if(age <30){
              System.out.println((sumAssured*2)/100);
          }else if(age > 30 && age <=50){
              System.out.println((sumAssured * 3)/100);
          }else{
              System.out.println((sumAssured * 5)/100);
          }
      }


    }

}














public class PolicyNumbermain
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter policy number");
        long policyNumber = sc.nextLong();
        String name = sc.next();
        int age = sc.nextInt();
        int sumAssured = sc.nextInt();
        PolicyHolder py = new PolicyHolder(policyNumber,name,age,sumAssured);
        PolicyHolder.PremiumCalculator pt = py. new PremiumCalculator();
        py.displayHolder();
        pt.calc_Scheme();

    }
}
