/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ange
 */
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("end")) {
                break;
            }
            
            this.processCommand(command);
        }
        
        System.out.println("Bye bye!");
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) {
            this.add();
        } else if (command.equals("search")) {
            this.search();
        } else {
            System.out.println("Unknown command");
        }
    }
    
    public void add() {
        // Ask for the word
        System.out.print("Word: ");
        String word = this.scanner.nextLine();
        
        // Ask for its translation
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();
        
        // Store them
        this.dictionary.add(word, translation);
    }
    
    public void search() {
        // Ask for the word
        System.out.print("To be translated: ");
        String word = this.scanner.nextLine();
        
        // Print its translation if found
        String translation = this.dictionary.translate(word);
        
        if (translation == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }
    }
}
