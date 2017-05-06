//Java Program by Alex Bledsoe, 05/01/2017

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //Gets input from the user.
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        sc.close();
        //Splits the string into a character array list
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < in.length(); i++) {
            chars.add(in.charAt(i));
        }
        //pushes each index in the char array list to a stack,
        //reversing the order that the chars will be displayed.
        Stack<Character> st = new Stack<>();
        for (Character aChar : chars) {
            st.push(aChar);
        }
        //prints the chars to the console.
        for (int i = 0; i < chars.size(); i++) {
            System.out.print(st.pop()+" ");
        }
    }
}
