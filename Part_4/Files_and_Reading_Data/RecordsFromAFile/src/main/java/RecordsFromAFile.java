
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                
                String[] parts = line.split(",");
                int age = Integer.valueOf(parts[1]);
                if (age == 1) {
                    System.out.println(parts[0] + ", age: " + age + " year");
                } else {
                    System.out.println(parts[0] + ", age: " + age + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
