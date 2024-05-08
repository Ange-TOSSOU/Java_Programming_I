
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int numberOfNumbers = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            numberOfNumbers = numberOfNumbers + 1;
            sum = sum + number;
        }
        
        if (numberOfNumbers > 0) {
            System.out.println("Average of the numbers: " + (double) sum / numberOfNumbers);
        }
    }
}
