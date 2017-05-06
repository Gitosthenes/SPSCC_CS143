/**
 * Java program by Alex Bledsoe, 4/25/2017.
 */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //Heading for the data being presented.
        System.out.println("Array                             Target Value          Index Returned");
        System.out.println("======================================================================");
        //Stores all test arrays into one, 2D, jagged array.
        int[][] allArrays = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                {3, 5, 7, 9},
                {2, 4, 6, 8, 12}};
        //Runs all 11 tests through the binary search and displays the results.
        System.out.printf("%-30s     5%21d\r\n", Arrays.toString(allArrays[0]), binarySearch(5, allArrays[0]));
        System.out.printf("%-30s     9%21d\r\n", Arrays.toString(allArrays[0]), binarySearch(9, allArrays[0]));
        System.out.printf("%-30s     0%21d\r\n", Arrays.toString(allArrays[0]), binarySearch(0, allArrays[0]));
        System.out.printf("%-30s    10%21d\r\n", Arrays.toString(allArrays[0]), binarySearch(10, allArrays[0]));
        System.out.printf("%-30s     2%21d\r\n", Arrays.toString(allArrays[1]), binarySearch(2, allArrays[1]));
        System.out.printf("%-30s     3%21d\r\n", Arrays.toString(allArrays[1]), binarySearch(3, allArrays[1]));
        System.out.printf("%-30s     9%21d\r\n", Arrays.toString(allArrays[1]), binarySearch(9, allArrays[1]));
        System.out.printf("%-30s     2%21d\r\n", Arrays.toString(allArrays[2]), binarySearch(2, allArrays[2]));
        System.out.printf("%-30s    12%21d\r\n", Arrays.toString(allArrays[2]), binarySearch(12, allArrays[2]));
        System.out.printf("%-30s    10%21d\r\n", Arrays.toString(allArrays[2]), binarySearch(10, allArrays[2]));
        System.out.printf("%-30s    -5%21d\r\n", Arrays.toString(allArrays[2]), binarySearch(-5, allArrays[2]));
    }

    /*
     * Takes target and array, then passes those plus min and max onto other binary search method.
     * (so that min and max don't have to be manually specified every time you want to do a search).
     */
    static int binarySearch(int target, int[] array) {
        return binarySearch(target, array, 0, array.length - 1);
    }

    // Method that actually performs the binary search.
    static int binarySearch(int target, int[] array, int min, int max) {
        //Base case.
        if (min > max) {
            return -1;
        }
        int mid = (min + max) / 2;
        //Cut the left half off and try again.
        if (array[mid] > target) {
            max = mid - 1;
            return binarySearch(target, array, min, max);
            //Cut the left half off and try again.
        } else if (array[mid] < target) {
            min = mid + 1;
            return binarySearch(target, array, min, max);
        }
        //Target found.
        return mid;
    }
}
