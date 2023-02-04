package Com.Day9_RFP;
import java.util.Random;
public class UC7 {
    public static void employeeWage(){
        Random rd = new Random();
        int var = rd.nextInt(2);
        int perHourSalary = 20;
        if (var==1){
            int workingHours = 8;
            System.out.println("employee wage is : " + workingHours*perHourSalary);
        }
        else{
            System.out.println("employee is absent");
        }
    }
    public static void main(String[] args) {
        employeeWage();

    }
}
