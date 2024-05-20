
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        final int MIN_VOLUME = 0;
        final int MAX_VOLUME = 100;
        int first = 0;
        int second = 0;
        
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + first + "/" + MAX_VOLUME);
            System.out.println("Second: " + second + "/" + MAX_VOLUME);
            System.out.print("> ");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            int quantity = Integer.valueOf(parts[1]);
            if (quantity <= 0) {
                continue;
            }
            
            if (parts[0].equals("add")) {
                first += quantity;
                if (first > MAX_VOLUME) {
                    first = MAX_VOLUME;
                }
            } else if (parts[0].equals("move")) {
                if (quantity > first) {
                    quantity = first;
                }
                first -= quantity;
                if (first < MIN_VOLUME) {
                    first = MIN_VOLUME;
                }
                second += quantity;
                if (second > MAX_VOLUME) {
                    second = MAX_VOLUME;
                }
            } else if (parts[0].equals("remove")) {
                second -= quantity;
                if (second < MIN_VOLUME) {
                    second = MIN_VOLUME;
                }
            }
        }
    }

}
