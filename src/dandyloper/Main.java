package dandyloper;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> groceryLine = new ArrayList<>();
        groceryLine.add("Jerome");
        groceryLine.add("Beth");
        groceryLine.add("Craig");
        groceryLine.add("Jade");

        System.out.println(groceryLine);

        groceryLine.remove("Beth");
        System.out.println(groceryLine);

        String jerome = groceryLine.get(0);
        System.out.println(jerome);

        int CraigIndex = groceryLine.indexOf("Craig");
        System.out.println(CraigIndex);

        // Similar to .length in array
        System.out.println(groceryLine.size());

        for (String name: groceryLine) {
            System.out.println(name);
        }

        List<String> dogNames = new ArrayList<>();
        dogNames.add("Snoopy");
        dogNames.add("Rin Tin Tin");
        dogNames.add("Gloria");

        int bethIndex = dogNames.indexOf("Beth");
        int gloriaIndex = dogNames.indexOf("Gloria");

        System.out.println(bethIndex + gloriaIndex);
    }
}
