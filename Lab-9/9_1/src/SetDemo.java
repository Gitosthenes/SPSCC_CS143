//Java program by Alex Bledsoe, 05/30/2017

import java.util.*;

public class SetDemo {

    public static void main(String args[]) {

        int count[] = {34,22,10,60,30,22};
        Set<Integer> unsortedSet = new HashSet<>();
        try {
            for(int i = 0; i < 5; i++) {
                unsortedSet.add(count[i]);
            }
            System.out.println("The unsorted set is: " + unsortedSet);

            TreeSet sortedSet = new TreeSet<>(unsortedSet);
            System.out.println("The sorted set is:   " + sortedSet);

            System.out.println("The First element of the set is: "+ sortedSet.first());
            System.out.println("The last element of the set is: "+ sortedSet.last());

            //1.1:
            System.out.println("\nUnsorted contains 10? " + unsortedSet.contains(10));
            //1.2:
            System.out.println("Sorted contains 5? " + sortedSet.contains(5));
            //1.3:
            System.out.println("Removing 10 from unsorted set...");
            unsortedSet.remove(10);
            //1.4:
            System.out.println("Unsorted still contains 10? " + unsortedSet.contains(10));
            //1.5:
            System.out.println("Adding 8 to the sorted set...");
            sortedSet.add(8);
            //1.6:
            System.out.println("Sorted set contains 8? " + sortedSet.contains(8));
            //1.7:
            System.out.println("\nThe unsorted set is: " + unsortedSet);
            //1.8:
            System.out.println("The sorted set is: "+ sortedSet);
            //1.9:
            System.out.println("\nAdding all values from the sorted set to the unsorted set...");
            unsortedSet.addAll(sortedSet);
            //1.10:
            System.out.println("\nThe unsorted set now contains: " + unsortedSet);
            System.out.println("The sorted set now contains: " + sortedSet);


        }
        catch(Exception e) {}
    }
}
