//Java program by Alex Bledsoe, 05/26/2017

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SortTimer {

    // Please expand method main() to meet the lab requirements.

    // You have the following sorting methods available:
    // insertionSort(int[] a);
    // selectionSort(int[] a);
    // mergeSort(int[] a);
    // quickSort(int[] a);
    // The array will be in sorted order after the routines are called!
    // Be sure to re-randomize the array after each sort.

    public static void main(String[] args) {
        
        // Create and initialize arrays then add them to an Array List.
        Random r = new Random();
        ArrayList<int[]> arrays = new ArrayList<>();

        int[] a = new int[100];
        int[] b = new int[1000];
        int[] c = new int[10000];
        int[] d = new int[100000];
        int[] e = new int[1000000];

        arrays.add(a);
        arrays.add(b);
        arrays.add(c);
        arrays.add(d);
        arrays.add(e);

        //Call all four sorts on each array and displays the results.
        for (int[] i : arrays) {

            //Insertion Sort:
            for (int j : i) {
                j = r.nextInt(999999);
            }
            long startTime = System.nanoTime();
            insertionSort(i);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000L;
            System.out.println("Working on an array of length " + i.length + ".");
            System.out.println("Insertion sort: " + duration + "ms.");

            //Selection Sort:
            for (int j : i) {
                j = r.nextInt(999999);
            }
            startTime = System.nanoTime();
            selectionSort(i);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000L;
            System.out.println("Selection sort: " + duration + "ms.");

            //Merge Sort:
            for (int j : i) {
                j = r.nextInt(999999);
            }
            startTime = System.nanoTime();
            mergeSort(i);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000L;
            System.out.println("Merge sort: " + duration + "ms.");

            //Quick Sort:
            for (int j : i) {
                j = r.nextInt(999999);
            }
            startTime = System.nanoTime();
            quickSort(a);
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000L;
            System.out.println("Quick sort: " + duration + "ms.\n");
        }
    }

    //
    // ###############################################################
    //
    // Standard implementations of sorting algorithms follow.
    //
    // Please do not include these methods in your lab submission
    //
    // ###############################################################
    //

    // Thanks to https://www.javatpoint.com/insertion-sort-in-java
    private static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    // Thanks to
    // http://www.java2novice.com/java-sorting-algorithms/selection-sort/
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    // Thanks to http://stackoverflow.com/questions/13727030/mergesort-in-java
    private static void mergeSort(int[] A) {
        if (A.length > 1) {
            int q = A.length / 2;

            // changed range of leftArray from 0-to-q to 0-to-(q-1)
            int[] leftArray = Arrays.copyOfRange(A, 0, q - 1);
            // changed range of rightArray from q-to-A.length to
            // q-to-(A.length-1)
            int[] rightArray = Arrays.copyOfRange(A, q, A.length - 1);

            mergeSort(leftArray);
            mergeSort(rightArray);

            merge(A, leftArray, rightArray);
        }
    }

    private static void merge(int[] a, int[] l, int[] r) {
        int totElem = l.length + r.length;
        // int[] a = new int[totElem];
        int i, li, ri;
        i = li = ri = 0;
        while (i < totElem) {
            if ((li < l.length) && (ri < r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                } else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            } else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
        // return a;
    }

    // Thanks to: http://www.algolist.net/Algorithms/Sorting/Quicksort
    private static void quickSort(int arr[]) {
        quickSortRecurse(arr, 0, arr.length - 1);
    }

    private static void quickSortRecurse(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSortRecurse(arr, left, index - 1);
        if (index < right)
            quickSortRecurse(arr, index, right);
    }

    private static int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }
}