package de.fham.softwareentwicklung.drei;

import java.util.ArrayList;
import java.util.List;

public class HandleNullpointerException {

    public static void main(String[] args) {

        // Angenommen wir haben eine Liste vom Typ String und wollen die Länge jedes Wortes ausgeben.
        // Ein Element der Liste ist null und auf diesem Element können wir keine lemngth() Operation aufrufen.

        List<String> myList = new ArrayList<>();

        myList.add("Hallo");
        myList.add("Hallo1");
        myList.add(null);
        myList.add("Hallo2");

        try {
            for (int i = 0; i < myList.size(); i++) {
                System.out.println(myList.get(i) + " hat die Länge:");
                System.out.println(myList.get(i).length());
            }
        } catch (NullPointerException e) {
            System.out.println("Folgende Exception wurde geschmissen: " + e);
        }
    }
}
