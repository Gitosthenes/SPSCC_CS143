//Java project by Alex Bledsoe, 05/02/2017

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Needed a class to implement the queue. Found ArrayDeque in the javadocs.
        Queue<String> Q = new ArrayDeque<>();
        System.out.println("How may things are going to be in the queue?");
        int numThings = sc.nextInt();
        System.out.println("Enter them now. They should all be separated by a single space.");
        for (int i = 0; i < numThings; i++) {
            Q.add(sc.next());
        }
        doubleQueue(Q);
    }

    private static void doubleQueue(Queue<String> Q) {
        int qSize = Q.size();
        for (int i = 0; i < qSize; i++) {
            Q.add(Q.peek());
            Q.add(Q.remove());
        }
        for (int i = 0; i < qSize * 2; i++) {
            System.out.print(Q.remove() + " ");
        }
    }
}
