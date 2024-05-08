
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int number;
        // implement here a program that reads user input
        // until the user enters 9999
        while (true) {
            number = Integer.valueOf(scanner.nextLine());
            
            if (number == 9999) {
                break;
            }
            
            list.add(number);
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int len = list.size();
        
        int smallest = list.get(0);
        for(int i = 0; i < len; i++) {
            number = list.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }
        System.out.println("Smallest number: " + smallest);
        
        for (int i = 0; i < len; i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index:  " + i);
            }
        }
    }
}
