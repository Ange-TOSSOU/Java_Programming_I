
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int n = 0;
        int sum = 0;
        int numbers = 0;
        int evens = 0;
        int odds = 0;
        double mean = 0.0;
        System.out.println("Give numbers:");
        while (true) {
            n = Integer.valueOf(scanner.nextLine());
            
            if (n == -1) {
                break;
            }
            
            numbers++;
            sum += n;
            if (n % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        if (numbers > 0) {
            mean = (double) sum / numbers;
        }
        System.out.println("Average: " + mean);
        System.out.println("Even: " + evens);
        System.out.println("Odd: " + odds);
    }
}
