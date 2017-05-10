//Java program by Alex Bledsoe, 05/08/2017

public class Entry {
    private int k;
    private String v;

    Entry(int key, String value) {
        k = key;
        v = value;
    }

    int getKey() {
        return k;
    }

    public String toString() {
        return ("(" + k + ", " + v + ")");
    }
}
