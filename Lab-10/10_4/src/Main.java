//Java program by Alex Bledsoe, 06-08-2017

import java.util.*;

public class Main {

    private static ArrayList<int[]> previousStates  = new ArrayList<>();
    private static int[] winningState = {0,0,1,3,3};
    private static int fails = 0;

    /**
     * Helper method that sets up the starting state and queue to hold steps.
     */
    private static void solve() {
        int[] startingState = {3,3,0,0,0};
        Stack<String> steps = new Stack<>();
        solve(startingState, steps);
    }

    /**
     * Recursively tries every possible move based on the state of the puzzle at a given time.
     * If a move is possible, it is added to the queue of steps, then prints the steps when a solution is found.
     */
    private static void solve(int[] state, Stack<String> steps) {
        //Base case (win condition)
        if (Arrays.equals(state, winningState)) {
            Stack<String> winningSteps = new Stack<>();
            while (!steps.isEmpty()) {
                winningSteps.push(steps.pop());
            }
            while (!winningSteps.isEmpty()) {
                System.out.println(winningSteps.pop());
            }
            System.out.println("Everyone's across in one piece!");
            System.out.println("\nThis program hit a dead end " + fails + " times before it solved the riddle.");
            System.exit(0);
        //Base case (lose condition)
        } else if (isIllegalState(state)) {
            fails++;
        //Recursive case (make a move)
        } else {
            int[] move;
            previousStates.add(state);
            //Checks which side of the river the boat is on.
            switch (state[2]) {
                //Case for starting side of the river.
                case 0:
                    //Make all possible moves:
                    steps.add("One vegetarian crosses the river.");
                    move = new int[]{state[0]-1,state[1],1,state[3]+1,state[4]};
                    solve(move, steps);
                    steps.pop();

                    steps.add("One meat eater crosses the river.");
                    move = new int[]{state[0],state[1]-1,1,state[3],state[4]+1};
                    solve(move, steps);
                    steps.pop();

                    steps.add("Two vegetarians cross the river.");
                    move = new int[]{state[0]-2,state[1],1,state[3]+2,state[4]};
                    solve(move, steps);
                    steps.pop();

                    steps.add("Two meat eaters cross the river.");
                    move = new int[]{state[0],state[1]-2,1,state[3],state[4]+2};
                    solve(move, steps);
                    steps.pop();

                    steps.add("One vegetarian and one meat eater cross the river.");
                    move = new int[]{state[0]-1,state[1]-1,1,state[3]+1,state[4]+1};
                    solve(move, steps);
                    steps.pop();
                    break;
                //Case for goal side of the river.
                case 1:
                    //Make all possible moves:
                    steps.add("One vegetarian crosses back over the river.");
                    move = new int[]{state[0]+1,state[1],0,state[3]-1,state[4]};
                    solve(move, steps);
                    steps.pop();

                    steps.add("One meat eater crosses back over the river.");
                    move = new int[]{state[0],state[1]+1,0,state[3],state[4]-1};
                    solve(move, steps);
                    steps.pop();

                    steps.add("Two vegetarians cross back over the river.");
                    move = new int[]{state[0]+2,state[1],0,state[3]-2,state[4]};
                    solve(move, steps);
                    steps.pop();

                    steps.add("Two meat eaters cross back over the river.");
                    move = new int[]{state[0],state[1]+2,0,state[3],state[4]-2};
                    solve(move, steps);
                    steps.pop();

                    steps.add("One vegetarian and one meat eater cross back over the river.");
                    move = new int[]{state[0]+1,state[1]+1,0,state[3]-1,state[4]-1};
                    solve(move, steps);
                    steps.pop();
                    break;
            }
        }
    }

    /**
     * Checks current state of puzzle for lose conditions, e.g.:
     *  - Meat eaters outnumber vegetarians on either side where vegetarians are present.
     *  - Everybody is in the same positions they were in at a  (the puzzle has looped).
     *  - There are a negative number of vegetarians or meat eaters on either side.
     *  - There are more than 3 vegetarians or meat eaters on either side.
     */
    private static boolean isIllegalState(int[] state) {
        return isPreviousState(state) ||
               state[1] > state[0] && state[0] > 0 ||
               state[4] > state[3] && state[3] > 0 ||
               state[0] > 3 ||
               state[0] < 0 ||
               state[1] > 3 ||
               state[1] < 0;
    }

    /**
     * Checks whether the current state of the puzzle is identical to
     * any of the previous moves made, indicating a loop.
     */
    private static boolean isPreviousState(int[] currentState) {
        for (int[] previousState : previousStates) {
            if (Arrays.equals(currentState, previousState)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        solve();
    }
}