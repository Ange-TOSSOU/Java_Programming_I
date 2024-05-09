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

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {// Add the new suitcase if it does not imply exceeded the maximum weight
        if (this.currentWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    private int currentWeight() {
        // Calculate the current weight of the suitcase
        int currentTotalWeight = 0;
        for (Suitcase suitcase: suitcases) {
            currentTotalWeight += suitcase.totalWeight();
        }
        
        return currentTotalWeight;
    }
    
    public void printItems() {
        for (Suitcase suitcase: suitcases) {
            // Print all items of this suitcase
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        String output = "";
        
        if (this.suitcases.isEmpty()) {
            output += "no suitcases";
        } else if (this.suitcases.size() == 1) {
            output += "1 suitcase";
        } else {
            output += this.suitcases.size() + " suitcases";
        }
        
        return output += " (" + this.currentWeight() + " kg)";
    }
}
