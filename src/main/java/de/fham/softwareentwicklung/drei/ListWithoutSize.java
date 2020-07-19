package de.fham.softwareentwicklung.drei;

import java.util.ArrayList;
import java.util.List;

public class ListWithoutSize {

    private List<String> list;
    public ListWithoutSize() {
        list = new ArrayList();
    }

    public String get(int i) {
        return list.get(i);
    }

    public void add(String element) {
        list.add(element);
    }
}
