//Java Program by Alex Bledsoe, 04/07/2017

import java.util.Random;

class Die {
    private Random rand = new Random();
    private int currentNumber;

    Die() {
        roll();
    }

    private void roll() {
        currentNumber = rand.nextInt(6) + 1;
    }

    int getCurrentNumber() {
        return currentNumber;
    }
}