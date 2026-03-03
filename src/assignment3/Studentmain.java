package assignment3;

public class Studentmain {
    public static void main(String[] args){
        StudentResult s1 = new StudentResult(1001,"Lakshman",85);


        StudentResult.Result  r1= s1.new Result();
        r1.cal_Result();

    }
}
