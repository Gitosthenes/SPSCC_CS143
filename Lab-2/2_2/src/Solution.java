//Java Program by Alex Bledsoe,

public class Solution {

    public static void main(String[] args) {
        Boolean nBool = true;
        Character nC = 'a';
        Byte nB = 100;
        Short nS = 1000;
        Integer nI = 10000;
        Long nL = 1000000000L;
        Float nF = 1.1f;
        Double nD = 10.1;
        String nX = "¯\\_(ツ)_//¯";

        whatIsThisObject(nBool);
        whatIsThisObject(nC);
        whatIsThisObject(nB);
        whatIsThisObject(nS);
        whatIsThisObject(nI);
        whatIsThisObject(nL);
        whatIsThisObject(nF);
        whatIsThisObject(nD);
        whatIsThisObject(nX);
    }

    private static void whatIsThisObject(Object obj) {
        if (obj instanceof Boolean) {
            System.out.println("That was a boolean.");
        } else if (obj instanceof Character) {
            System.out.println("That was a character.");
        } else if (obj instanceof Number) {
            if (obj instanceof Byte) {
                System.out.println("That was a byte.");
            } else if (obj instanceof Short) {
                System.out.println("That was a short.");
            } else if (obj instanceof Integer) {
                System.out.println("That was an integer.");
            } else if (obj instanceof Long) {
                System.out.println("That was a long.");
            } else if (obj instanceof Float) {
                System.out.println("That was a float.");
            } else if (obj instanceof Double) {
                System.out.println("That was a double.");
            }
        } else {
            System.out.println("I don't know what that object is.");
        }
    }
}
