
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container first = new Container();
        Container second = new Container();
        
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            int quantity = Integer.valueOf(parts[1]);
            
            if (parts[0].equals("add")) {
                first.add(quantity);
            } else if (parts[0].equals("move")) {
                if (quantity > first.contains()) {
                    quantity = first.contains();
                }
                
                first.remove(quantity);
                second.add(quantity);
            } else if (parts[0].equals("remove")) {
                second.remove(quantity);
            }
        }
    }

}
