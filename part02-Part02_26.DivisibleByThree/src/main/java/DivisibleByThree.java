
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    
    public static void divisibleByThreeInRange(int beginning, int end) {
        int a = beginning / 3;
        if (beginning % 3 != 0) {
            a++;
        }
        int b = end / 3;
        
        for (int i = a; i <= b; i++) {
            System.out.println(3 * i);
        }
    }

}
