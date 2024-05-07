
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sumOfPositiveNumbers = 0;
        int numberOfPositiveNumbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                numberOfPositiveNumbers = numberOfPositiveNumbers + 1;
                sumOfPositiveNumbers = sumOfPositiveNumbers + number;
            }
        }
        
        if (sumOfPositiveNumbers > 0) {
            System.out.println((double) sumOfPositiveNumbers / numberOfPositiveNumbers);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
