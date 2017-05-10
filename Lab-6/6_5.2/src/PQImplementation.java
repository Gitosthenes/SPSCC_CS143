//Java program by Alex Bledsoe, 05/08/2017

public class PQImplementation {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        //Test case 1:
        pq.insert(3, "test");
        pq.insert(4, "every");
        pq.insert(5, "edge");
        while (pq.size() > 0) {
            System.out.println(pq.removeMin());
        }
        System.out.println();

        //Test case 2:
        pq.insert(10, "chipped");
        pq.insert(5, "quality");
        pq.insert(12, "beef");
        pq.insert(1, "good");
        while (pq.size() > 0) {
            System.out.println(pq.removeMin());
        }
        System.out.println();

        //Test case 3:
        pq.insert(8, "must");
        pq.insert(3, "all");
        pq.insert(7, "things");
        pq.insert(10, "end");
        while (pq.size() > 0) {
            System.out.println(pq.removeMin());
        }
    }
}
