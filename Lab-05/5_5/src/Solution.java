//Java program by Alex Bledsoe, 5/2/2017.

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //Create scanner object and get string to test from user.
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        //Passes the string into isValid method.
        if (isValid(in)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }

    //Method checks for valid parenthesis pattern in a string.
    private static boolean isValid(String in) {
        //Turns input string into a character array.
        char[] chars = new char[in.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = in.charAt(i);
        }
        /*New Stack to hold '(' characters.
         *Loop checks for ')' characters when the Stack is empty (invalid pattern, returns false).*/
        Stack<Character> st = new Stack<>();
        for (char aChar : chars) {
            if (aChar == ')' && st.isEmpty()) {
                return false;
            } else if (aChar == '(') {
                st.push(aChar);
            } else if (aChar == ')') {
                st.pop();
            }
        }
        /*If uneven # of each parenthesis (Stack isn't empty after loop),
         *then there is an invalid pattern, returns false.
         *Else it will return true.*/
        return st.isEmpty();
    }
}
