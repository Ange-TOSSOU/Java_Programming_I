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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxTotalWeight;
    
    public Suitcase(int maxTotalWeight) {
        this.maxTotalWeight = maxTotalWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        // Add the new item if it does not imply exceeded the maximum weight
        if (this.totalWeight() + item.getWeight() <= this.maxTotalWeight) {
            this.items.add(item);
        }
    }
    
    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        // Calculate the current weight of the suitcase
        int currentTotalWeight = 0;
        for (Item item: items) {
            currentTotalWeight += item.getWeight();
        }
        
        return currentTotalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        for (Item item: items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    
    @Override
    public String toString() {
        String output = "";
        
        if (this.items.isEmpty()) {
            output += "no items";
        } else if (this.items.size() == 1) {
            output += "1 item";
        } else {
            output += this.items.size() + " items";
        }
        
        return output += " (" + this.totalWeight() + " kg)";
    }
}
