
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        int numberOfNegativeNumbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number < 0) {
                numberOfNegativeNumbers = numberOfNegativeNumbers + 1;
            }
        }
        
        System.out.println("Number of negative numbers: " + numberOfNegativeNumbers);
    }
}
