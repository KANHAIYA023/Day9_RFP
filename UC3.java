package Com.Day9_RFP;
import java.util.Random;
public class UC3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int i = rd.nextInt(3);
        int perHourSalary = 20;
        if (i==1){
            int workingHours = 8;
            System.out.println("full time employee wage is : " + perHourSalary*workingHours);
        } else if (i==2) {
            int workingHours = 4;
            System.out.println("part time employee wage is : " + perHourSalary*workingHours);
        }else {
            int workingHours = 0;
            System.out.println("employee is absent");
        }
    }
}
