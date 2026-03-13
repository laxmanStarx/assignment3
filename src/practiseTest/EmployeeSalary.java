package practiseTest;

//
//Create a class Employee with attributes: empId, empName, basicSalary.
//•	Use a constructor to initialize values using the this keyword.
//•	Create an inner class SalaryCalculator inside Employee.
//        •	Business Logic: Calculate HRA (20%), DA (10%), and total salary.
//•	The main() method should be in a separate class EmployeeMain to create objects and display salary details.

class Employee{
    int empId;
    String empName;
    float basicSalary;
    Employee(int empId,String empName,float basicSalary){
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    public void displayEmployee(){
        System.out.println("employeeId: "+ empId);
        System.out.println("employee details: "+ empName);
        System.out.println("basic salary "+ basicSalary);

    }

    class SalaryCalculator{
        float HRApercent = 20;
        float DApercent = 10;
        float HRA = (basicSalary/100)*HRApercent;
        float DA = (basicSalary/100)*DApercent;
        float total_salary;
//        float result = (basicSalary/100)*HRA + (basicSalary/100)*DA;
        public void calc_salary(){
            total_salary = basicSalary + HRA + DA;
            System.out.println("your Total salary will be "+ total_salary);
        }
        public void displaySalary(){
//            System.out.println("employeeId: "+ empId);
//            System.out.println("employee details: "+ empName);
//            System.out.println("basic salary "+ basicSalary);
            System.out.println("Your HRA is :" + HRA);
            System.out.println("Your DA is "+ DA);

        }
    }
}






public class EmployeeSalary {
    public static void main(String[] args) {


        Employee e1 = new Employee(101, "laxman", 90000.40f);
        Employee e2 = new Employee(102, "Sai", 82000.40f);

        Employee.SalaryCalculator s1 = e1.new SalaryCalculator();
         Employee.SalaryCalculator s2 = e2.new SalaryCalculator();

        e1.displayEmployee();
        s1.calc_salary();

        e2.displayEmployee();
        s2.calc_salary();



    }
}
