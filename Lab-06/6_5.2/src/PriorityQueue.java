//Java project by Alex Bledsoe, 05/08/2017

import java.util.Stack;

class PriorityQueue {
    private Stack<Entry> main;
    private int stackSize;

    //Constructor
    PriorityQueue() {
        main = new Stack<>();
        stackSize = 0;
    }

    //returns the current size of the priority queue.
    int size() {
        return stackSize;
    }

    //returns entry with smallest key (highest priority) and removes it from the priority queue.
    String removeMin() {
        stackSize--;
        return main.pop().toString();
    }

    //Inserts new entry into the priority queue based on the given key value.
    void insert(int key, String value) {
        Entry newest = new Entry(key, value);
        if (main.size() == 0) {
            main.push(newest);
            stackSize++;
        } else {
            Stack<Entry> holder = new Stack<>();
            while (!main.empty() && newest.getKey() >= main.peek().getKey()) {
                holder.push(main.pop());
                stackSize--;
            }
            main.push(newest);
            stackSize++;
            while (holder.size() > 0) {
                main.push(holder.pop());
                stackSize++;
            }
        }
    }
}
