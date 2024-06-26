
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());
        
        boolean isLeapYear = false;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                isLeapYear = true;
            }
        } else {
            if (year % 4 == 0) {
                isLeapYear = true;
            }
        }
        
        if (isLeapYear) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
