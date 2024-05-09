
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        if (elements.size() == 0) {
            return "The collection " + this.name + " is empty.";
        }
        
        String output = "The collection " + this.name + " has ";
        
        if (elements.size() == 1) {
            output += elements.size() + " element:";
        } else {
            output += elements.size() + " elements:";
        }
        
        for (String element: elements) {
            output += "\n" + element;
        }
        
        return output;
    }
}
