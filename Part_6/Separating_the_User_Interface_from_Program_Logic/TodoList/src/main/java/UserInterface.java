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
    private Scanner scanner;
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
            
            this.processCommand(command);
        }
    }
    
    public void processCommand(String command) {
        if (command.equals("add")) {
            this.add();
        } else if (command.equals("list")) {
            this.todoList.print();
        } else if (command.equals("remove")) {
            this.remove();
        }else {
            System.out.println("Unknown command");
        }
    }
    
    public void add() {
        // Ask for the task
        System.out.print("To add: ");
        String task = this.scanner.nextLine();
        
        // Add it
        this.todoList.add(task);
    }
    
    public void remove() {
        // Ask for the task id to remove
        System.out.print("Which one is removed? ");
        int idTask = Integer.valueOf(this.scanner.nextLine());
        
        // Remoeve it
        this.todoList.remove(idTask);
    }
}
