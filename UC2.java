package Com.Day9_RFP;
import java.util.Random;
public class UC2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int i = rd.nextInt(2);
        int perHoursSalary = 20;
        if (i==1){
            int workingHour = 8;
            System.out.println("full time employee wage is : " + perHoursSalary*workingHour);
        }
        else{
            int workingHours = 0;
            System.out.println("employee is absent : " + perHoursSalary*workingHours);
        }
    }
}
