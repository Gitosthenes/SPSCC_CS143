/**
 * Java Program by Alex Bledsoe, 4/25/2017.
 */
public class Solution {
    public static void main(String[] args){

    }

    /*
     * Initial method that passes the target and array onto the method that actually performs the search,
     * but also passes a min, max and iterations counter as well so that only the target and array have
     * to be passed in the main method.
     */
    static int binarySearch(int target, int[] array){
        return(binarySearch(target, array, 0, array.length-1, 0));
    }

    //RECURSIVE method that actually performs the binary search.
    static int binarySearch(int target, int[] array, int min, int max, int iterations){
        if (min > max){
            return -iterations;
        }
        int mid = (min + max)/2;
        if(array[mid]>target){
            iterations++;
            max = mid-1;
            return binarySearch(target, array, min, max, iterations);
        } else if (array[mid]<target) {
            iterations++;
            min = mid +1;
            return binarySearch(target, array, min, max, iterations);
        }
        iterations++;
        return iterations;
    }
}
