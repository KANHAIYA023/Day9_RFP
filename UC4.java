package Com.Day9_RFP;
import java.util.Random;
public class UC4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int i = rd.nextInt(3);
        int perHoursSalary = 20;
        switch (i){
            case 0:
                System.out.println("employee is absent");
                break;
            case 1:
                int workingHours = 8;
                System.out.println("full time employee wage is : " + perHoursSalary*workingHours);
                break;
            case 2:
                int workingHours2 = 4;
                System.out.println("part time employee wage is : " + perHoursSalary*workingHours2);
                break;
        }
    }
}
