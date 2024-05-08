import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.print("Title: ");
            String title = sc.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(sc.nextLine());
            
            System.out.print("Publication year: ");
            int year = Integer.valueOf(sc.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        
        System.out.print("What information will be printed? ");
        String info = sc.nextLine();
        
        if (info.equals("everything")) {
            for (Book book: books) {
                System.out.println(book);
            }
        } else if (info.equals("name")) {
            for (Book book: books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
