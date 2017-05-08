//Java program by Alex Bledsoe, 05/07/2017

import java.util.*;

public class OldSolution {
    public static void main(String[] args) {
        //Create new Scanner and PriorityQueue.
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Entry> pq = new PriorityQueue<>();
        //Takes user input and stores it in the queue.
        for (int i = 0; i < 10; i++) {
            String v = sc.next();
            int k = sc.nextInt();
            pq.add(new Entry(k, v));
        }
        //Prints each value in the queue, ordered by key (ascending).
        System.out.println("The output from the priority queue:");
        while (pq.size() > 0) {
            System.out.println(pq.remove());
        }
    }

    //Class that stores and orders the key/value pairs
    //that are stored in the priorityQueue.
    static class Entry implements Comparable<Entry> {
        int k;
        String v;

        Entry(int key, String value) {
            k = key;
            v = value;
        }

        public String toString() {
            return (v);
        }

        public int compareTo(Entry b) {
            return Integer.compare(this.k, b.k);
        }
    }
}
