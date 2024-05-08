
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumBirth = 0;
        int numberOfInput = 0;
        int curLength;
        int longestLength = 0;
        String longestName = "";
        while (true) {
            String text = scanner.nextLine();
            
            if (text.equals("")) {
                break;
            }
            
            String[] parts = text.split(",");
            
            curLength = parts[0].length();
            if (curLength > longestLength) {
                longestLength = curLength;
                longestName = parts[0];
            }
            
            sumBirth += Integer.valueOf(parts[1]);
            numberOfInput++;
        }
        
        if (numberOfInput > 0) {
            System.out.println("Longest name: " + longestName);
            System.out.println("Average of the birth years: " + (1.0 * sumBirth / numberOfInput));
        }
    }
}
