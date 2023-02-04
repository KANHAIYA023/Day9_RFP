package Com.Day9_RFP;
public class UC8 {
    public static void amazon(int perHourSalary, int days){
        System.out.println("Employee wage of amazon");
        int workingHours = 8;
        for (int i=1; i<=days; i++){
            System.out.println(i + " days of employee wage is : " + perHourSalary*workingHours*i);
        }
    }
    public static void flipkard(int perHourSalary, int days){
        System.out.println("Employee wage of flipkard");
        int workingHours = 9;
        for (int j=1; j<=days; j++){
            System.out.println(j + " days of employee wage is : " +perHourSalary*workingHours*j);
        }
    }
    public static void meesho(int perHourSalary, int days){
        System.out.println("Employee wage of Zara");
        int workingHour = 10;
        for (int k=1; k<=days; k++){
            System.out.println(k + " days of employee wage is : " +perHourSalary*workingHour*k);
        }
    }

    public static void main(String[] args) {
        amazon(50,8);
        System.out.println();
        flipkard(50,8);
        System.out.println();
        meesho(40,8);

    }
}
