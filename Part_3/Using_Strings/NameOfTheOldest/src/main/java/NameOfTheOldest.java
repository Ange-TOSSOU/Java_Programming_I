
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        int curAge;
        String nameOldest = "";
        while (true) {
            String text = scanner.nextLine();
            
            if (text.equals("")) {
                break;
            }
            
            String[] subParts = text.split(",");
            
            curAge = Integer.valueOf(subParts[1]);
            if (curAge > oldestAge) {
                oldestAge = curAge;
                nameOldest = subParts[0];
            }
        }
        
        System.out.println("Name of the oldest: " + nameOldest);
    }
}
