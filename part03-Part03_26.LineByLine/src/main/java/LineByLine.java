
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            
            if (text.equals("")) {
                break;
            }
            
            String[] subParts = text.split(" ");
            
            for (String str : subParts) {
                System.out.println(str);
            }
        }
    }
}
