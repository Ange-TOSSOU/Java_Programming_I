
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStrings = 0;
        while (true) {
            String str = scanner.nextLine();
            
            if (str.equals("end")) {
                break;
            }
            
            numberOfStrings++;
        }
        
        System.out.println(numberOfStrings);
    }
}
