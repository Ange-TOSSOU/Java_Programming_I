/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ange
 */
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stackOfStrings;
    
    public Stack() {
        stackOfStrings = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return stackOfStrings.isEmpty();
    }
    
    public void add(String value) {
        stackOfStrings.add(value);
    }
    
    public ArrayList<String> values() {
        return stackOfStrings;
    }
    
    public String take() {
        if (stackOfStrings.isEmpty()) {
            return null;
        }
        
        int nbStrings = stackOfStrings.size();
        
        // Clone the string want to remove
        String element = String.valueOf(stackOfStrings.get(nbStrings - 1));
        
        // Remove the original string from the stack
        stackOfStrings.remove(nbStrings - 1);
        
        // Return the cloned string
        return element;
    }
}
