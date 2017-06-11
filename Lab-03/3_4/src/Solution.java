//Java program by Alex Bledsoe, 04/19/2017
public class Solution {
    public static void main(String[] args) {
        //Creates 3 doubly linked lists to test.
        DoublyLinkedList<Integer> dLL1 = new DoublyLinkedList<>();
        DoublyLinkedList<Integer> dLL2 = new DoublyLinkedList<>();
        DoublyLinkedList<String> dLL3 = new DoublyLinkedList<>();

        //Assigns elements to each node in each list.
        dLL1.addFirst(1);
        dLL1.addLast(2);
        dLL1.addLast(3);
        dLL1.addLast(4);
        dLL1.addLast(5);

        dLL2.addFirst(1);
        dLL2.addLast(2);
        dLL2.addLast(3);
        dLL2.addLast(4);

        dLL3.addFirst("First");
        dLL3.addLast("Second");
        dLL3.addLast("Third");
        dLL3.addLast("Fourth");
        dLL3.addLast("Fifth");
        dLL3.addLast("Sixth");

        //Calls findMiddle() method for each list and prints to the console.
        System.out.println(dLL1.toString());
        System.out.println("The middle value is " + dLL1.findMiddle() + ".\r\n");
        System.out.println(dLL2.toString());
        System.out.println("The middle value is " + dLL2.findMiddle() + ".\r\n");
        System.out.println(dLL3.toString());
        System.out.println("The middle value is " + dLL3.findMiddle() + ".\r\n");
    }
}

