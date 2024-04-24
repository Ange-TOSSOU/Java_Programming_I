
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        Person matti = new Person("Matti");
        Person juhana = new Person("Juhana");

        matti.setHeight(180);
        matti.setWeight(86);

        juhana.setHeight(175);
        juhana.setWeight(64);

        String mattiBodyMassIndex = String.format("%.2f", matti.bodyMassIndex());
        String juhanaBodyMassIndex = String.format("%.2f", juhana.bodyMassIndex());
        System.out.println(matti.getName() + ", body mass index is " + mattiBodyMassIndex);
        System.out.println(juhana.getName() + ", body mass index is " + juhanaBodyMassIndex);
    }
}
