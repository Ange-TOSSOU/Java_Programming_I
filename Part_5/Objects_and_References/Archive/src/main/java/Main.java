
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Item> archive = new ArrayList<>();
        
        String identifier, name;
        while (true) {
            // Get the identifier from the user
            System.out.println("Identifier? (empty will stop)");
            identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            
            // Get the name from the user
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Item item = new Item(identifier, name);
            if (!archive.contains(item)) {
                archive.add(item);
            }
        }
        
        System.out.println("");
        
        // Print all the items
        System.out.println("==Items==");
        for (Item item : archive) {
            System.out.println(item);
        }
    }
}
