
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner sc = new Scanner(Paths.get(file))) {
            int nbNumbers = 0;
            int number;
            
            while (sc.hasNextLine()) {
                number = Integer.valueOf(sc.nextLine());
                if (lowerBound <= number && number <= upperBound) {
                    nbNumbers++;
                }
            }
            
            System.out.println("Numbers: " + nbNumbers);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
