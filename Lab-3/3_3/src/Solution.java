//Java program by Alex Bledsoe, 04/17/2017
public class Solution {
    public static void main(String[] args) {
        //3.1:
        DoublyLinkedList<Integer> dLL1 = new DoublyLinkedList<Integer>();
        dLL1.addFirst(5);
        dLL1.addLast(2);
        dLL1.addLast(3);
        dLL1.addLast(8);
        dLL1.addLast(1);
        dLL1.addLast(7);
        dLL1.addLast(2);
        dLL1.addLast(7);
        dLL1.addLast(9);
        dLL1.addLast(2);
        dLL1.addLast(1);
        //3.2:
        System.out.println(dLL1.toString());
        //3.3:
        DoublyLinkedList<Integer> dLL2 = new DoublyLinkedList<Integer>();
        dLL2.addFirst(dLL1.removeFirst());
        while (!dLL1.isEmpty()) {
            dLL2.addLast(dLL1.removeFirst());
        }
        //3.4:
        System.out.println(dLL2.toString());
        //3.5:
        DoublyLinkedList<Integer> dLL3 = new DoublyLinkedList<Integer>();
        while (!dLL2.isEmpty()) {
            //3.5.1:
            if (dLL2.last() == 2) {
                dLL3.addFirst(dLL2.removeLast() + 3);
                //3.5.2:
            } else if (dLL2.last() == 7) {
                dLL3.addFirst(dLL2.removeLast() - 1);
            } else {
                dLL3.addFirst(dLL2.removeLast());
            }
        }
        //3.6:
        System.out.println(dLL3.toString());
    }
}