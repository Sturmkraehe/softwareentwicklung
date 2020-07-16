package de.fham.softwareentwicklung.zwei.stack;

import de.fham.softwareentwicklung.zwei.queue.EmptyQueueException;
import de.fham.softwareentwicklung.zwei.queue.IntQueue;
import de.fham.softwareentwicklung.zwei.queue.Queue;
import java.util.ArrayList;

public class IntStack implements Stack {

    private int first = 0;
    private int last = 0;
    private ArrayList list = new ArrayList();


    @Override
    public boolean isEmpty() {
        if (first >= last) {
          return true;
        } else {
            return false;
        }
    }

    @Override
    public void pushOrigin(String i) {
        list.add(last, i);
        last++;
    }

    @Override
    public String pop() {
        if (!isEmpty()){
            String a = (String) list.get(last);
            last--;
            return a;
        } else {
            throw new EmptyStackException();
        }
    }
}
