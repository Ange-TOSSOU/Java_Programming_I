
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        int input;
        while (true) {
            input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            list.add(Integer.valueOf(input));
        }
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        double sum = 0.0;
        for (Integer n : list) {
            sum += n;
        }
        System.out.println("Average: " + (sum / list.size()));
    }
}
