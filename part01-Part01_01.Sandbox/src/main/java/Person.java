/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ange
 */
public class Person {
    private String name;
    private int age;
    
    public Person (String initialName) {
        this.age = 0;
        this.name = initialName;
    }
    
    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }
    
    public void growOlder() {
        this.age = this.age + 1;
    }
}
