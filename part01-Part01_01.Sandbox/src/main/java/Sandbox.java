
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        
        while (true) {
            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();
            
            if (input.equals("no")) {
                break;
            }
        }
        
        System.out.println("LOL");
    }
}
