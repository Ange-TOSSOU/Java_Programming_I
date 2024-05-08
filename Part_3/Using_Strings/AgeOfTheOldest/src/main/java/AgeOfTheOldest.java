
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        int curAge;
        while (true) {
            String text = scanner.nextLine();
            
            if (text.equals("")) {
                break;
            }
            
            String[] subParts = text.split(",");
            
            curAge = Integer.valueOf(subParts[1]);
            if (curAge > oldestAge) {
                oldestAge = curAge;
            }
        }
        
        System.out.println("Age of the oldest: " + oldestAge);
    }
}
