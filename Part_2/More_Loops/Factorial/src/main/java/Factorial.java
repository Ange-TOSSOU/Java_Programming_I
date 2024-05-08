
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number? ");
        int number = Integer.valueOf(scanner.nextLine());
        
        int factorial = 1;
        
        while (number > 1) {
            factorial *= number;
            number--;
        }
        
        System.out.println("Factorial: " + factorial);
    }
}
