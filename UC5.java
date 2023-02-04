package Com.Day9_RFP;
import java.util.Scanner;
public class UC5 {
    public static void main(String[] args) {
        int perHourSalary = 20;
        for (int day=1; day<=20; day++){
            int workingHours = 8;
            System.out.println(day + "day of salary wage is: " + perHourSalary*workingHours*day);
            if (day==20){
                break;
            }
        }
    }
}
