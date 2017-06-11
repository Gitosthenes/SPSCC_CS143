/**
 * Java program by Alex Bledsoe on 4/23/2017.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("Value         Triangle(value)");
        System.out.println("=============================");
        for(int i = 1; i <= 10; i++){
            System.out.printf("%-20d%d\r\n", i, triangle(i));
        }
    }
    static int triangle(int n){
        if (n == 1) {
            return 1;
        }else{
            return(n + triangle(n-1));
        }
    }
}