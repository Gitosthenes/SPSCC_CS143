/**
 * Java program by Alex Bledsoe, 4/24/2017.
 */
public class Solution {
    public static void main(String[] args) {
        //Creates an array of 1000 integers.
        int[] valueArray = new int[44650850];   //As large as IntelliJ will consistently let me make the array.
        //assigns values to the array.
        for (int i = 0; i < valueArray.length; i++) {
            valueArray[i] = i;
        }
        //Creates an array to hold the target values we'll be testing for.
        int[] targetArray = new int[]{5, 10, 17, 20, 25, 50, 83, valueArray.length, -1};

        System.out.println("Testing search with an array of length " + valueArray.length + ".\r\n");
        //Calls the linear search method to find target values
        System.out.println("Testing linear search:");
        for (int i = 0; i < targetArray.length; i++) {
            if (linearSearch(targetArray[i], valueArray) >= 0) {
                System.out.println("Linear Search needed " + linearSearch(targetArray[i], valueArray) +
                                   " iterations to find " + targetArray[i]);
            } else {
                System.out.println("Linear Search needed " + valueArray.length +
                                   " iterations and FAILED to find " + targetArray[i]);
            }
        }
        System.out.println("");

        //Calls the binary search method to find the target values.
        System.out.println("Testing binary search:");
        for (int i = 0; i < targetArray.length; i++) {
            if (binarySearch(targetArray[i], valueArray) >= 0) {
                System.out.println("Binary Search needed " + binarySearch(targetArray[i], valueArray) +
                                   " iterations to find " + targetArray[i]);
            } else {
                System.out.println("Binary Search needed " + binarySearch(targetArray[i], valueArray)*-1 +
                                   " iterations and FAILED to find " + targetArray[i]);
            }
        }
    }

    //method to search through each value in the array to find a target value.
    static int linearSearch(int target, int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]) {
                return count;
            } else {
                count++;
            }
        }
        return -1;
    }

    //Method that
    static int binarySearch(int target, int[] array) {
        int count = 0;
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (target > mid) {
                count++;
                min = mid + 1;
            } else if (target < mid) {
                count++;
                max = mid - 1;
            } else {
                count++;
                return count;
            }
        }
        return -count;
    }
}
