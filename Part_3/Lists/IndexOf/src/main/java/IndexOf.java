
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        System.out.print("Search for? ");
        int n = Integer.valueOf(scanner.nextLine());
        
        int len = list.size();
        for (int i = 0; i < len; i++) {
            if (list.get(i) == n) {
                System.out.println(n + " is at index " + i);
            }
        }
    }
}
