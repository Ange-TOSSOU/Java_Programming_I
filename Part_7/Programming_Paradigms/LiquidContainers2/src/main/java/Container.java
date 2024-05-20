/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ange
 */
public class Container {
    private int minCapacity;
    private int maxCapacity;
    private int capacity;
    
    public Container() {
        this.minCapacity = 0;
        this.maxCapacity = 100;
        this.capacity = 0;
    }
    
    public int contains() {
        return this.capacity;
    }
    
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        
        this.capacity += amount;
        if (this.capacity > this.maxCapacity) {
            this.capacity = this.maxCapacity;
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        
        this.capacity -= amount;
        if (this.capacity < this.minCapacity) {
            this.capacity = this.minCapacity;
        }
    }
    
    @Override
    public String toString() {
        return this.capacity + "/" + this.maxCapacity;
    }
}
