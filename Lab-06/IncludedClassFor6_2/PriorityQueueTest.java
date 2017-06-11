
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Entry> pq = new PriorityQueue<Entry>();

		pq.add(new Entry(5,"Hello"));
		pq.add(new Entry(10, "never forget"));
		pq.add(new Entry(2, "an elephant"));

		System.out.println("The output from the priority queue:");

		while (!pq.isEmpty()) {
			System.out.println(pq.remove());
		}

	}

	static class Entry implements Comparable<Entry> {
		int k;
		String v;

		public Entry() {
		}

		public Entry(int key, String value) {
			k = key;
			v = value;
		}
		
		public String toString() {
			return ("Key " + k + " value " + v);
		}
		
		public int compareTo(Entry b) {
			return Integer.compare(this.k, b.k);
		}
	}

}
