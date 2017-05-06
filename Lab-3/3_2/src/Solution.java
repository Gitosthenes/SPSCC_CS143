//Java program by Alex Bledsoe, 04/17/2017
public class Solution {
    public static void main(String[] main) {
        SinglyLinkedList<Integer> sLL = new SinglyLinkedList<>();
        sLL.addFirst(5);
        sLL.addLast(2);
        sLL.addLast(3);
        sLL.addLast(8);
        sLL.addLast(1);
        sLL.addLast(7);

        System.out.println(sLL.toString());
    }
}