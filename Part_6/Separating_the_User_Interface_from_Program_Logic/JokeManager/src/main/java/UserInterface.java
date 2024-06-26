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

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("What a joke!");
        while (true) {
            this.printCommands();
            
            String command = this.scanner.nextLine();
            if (command.equals("X")) {
                break;
            } else {
                this.processCommand(command);
            }
        }
    }
    
    private void printCommands() {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }
    
    private void processCommand(String command) {
        if (command.equals("1")) {
            System.out.println("Write the joke to be added:");
            String joke = scanner.nextLine();
            
            this.jokeManager.addJoke(joke);
        } else if (command.equals("2")) {
            System.out.println("Drawing a joke.");
            
            System.out.println(this.jokeManager.drawJoke());
        } else if (command.equals("3")) {
            System.out.println("Printing the jokes.");
            
            this.jokeManager.printJokes();
        }
    }
}
