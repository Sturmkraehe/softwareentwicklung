package de.fham.softwareentwicklung.drei;

public class HandleIndexOutOfBounceException {

    public static void main(String[] args) {

        //Angenommen wir haben keinen Zugriff auf die Länge einer Liste, müssen dies aber herausfinden

        ListWithoutSize listWithoutSize = new ListWithoutSize();

        listWithoutSize.add("Hallo");
        listWithoutSize.add("Hallo1");
        listWithoutSize.add("Hallo2");

        int i = 0;
        try {
            while (true) {
                System.out.println(listWithoutSize.get(i));
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Folgende Exception wurde geschmissen: " + e);
            System.out.println("Das Array hat die Länge: " + i);
        }
    }

}
