//Java program by Alex Bledsoe, 06-08-2017

import java.util.*;

public class Main {
    int[] winningState = {0,0,3,3,1,0,0};
    boolean isFirstMove = true;
    Queue<String> steps;

    public static void main(String[] args) {

    }

    //Helper method that sets up the starting state and queue to hold steps
    void solve() {
        int[] startingState = {3,3,0,0,0,0,0};
        steps = new ArrayDeque<>();
        solve(startingState, steps);
    }

    //Recursively tries every possible move based on the state of the puzzle at a given time.
    //If a move is possible, it is added to the queue of steps.
    void solve(int[] state, Queue<String> steps) {
        //Check for base case (win condition)
        if (Arrays.equals(state, winningState)) {
            while (!steps.isEmpty()){
                steps.poll();
            }
        //Check for base case (lose condition)
        } else if (isIllegalState(state)) {
            steps.poll();
        //Didn't win or lose so make a move
        } else {
            //Change first move boolean value so loops can be caught.
            isFirstMove = false;
            //Checks which side of the river the boat is on.
            switch (state[4]) {
                //Goes down this path when boat is on starting side of the river.
                case 0:
                    //Checks if the boat has anybody in it
                    if (boatHasPeople(state)) {
                        //Check if vegetarian is in 1st spot on boat
                        if(state[5] == -1) {
                            //Check if vegetarian in 2nd spot on boat
                            if (state[6] == -1) {

                            //Check if meat eater in 2nd spot on boat
                            } else if (state[6] == 1) {

                            //2nd spot on boat must be empty
                            } else {

                            }
                        //Checks if meat eater in 1st spot on boat.
                        } else if(state[5] == 1) {
                            //Check if vegetarian is in 2nd spot on boat
                            if(state[6] == -1) {

                            //Check if meat eater is in 2nd spot on boat.
                            } else if (state[6] == 1) {

                            //2nd spot must be empty
                            } else {

                            }
                        //The 1st spot in the boat must be empty
                        } else {
                            //Checks if vegetarian is in 2nd spot on boat
                            if(state[6] == -1) {

                            //Must be a meat eater in the 2nd spot
                            } else {

                            }
                        }
                    //The boat must be empty
                    } else {
                        //Try all possible moves:
                        steps.add("One vegetarian crosses on the boat.");
                        int[] move = {2,3,0,0,1,-1,0};
                        solve(move, steps);

                        steps.add("Two vegetarians cross on the boat.");
                        move = new int[]{1,3,0,0,1,-1,-1};
                        solve(move, steps);

                        steps.add("One meat eater crosses on the boat.");
                        move = new int[]{3,2,0,0,1,1,0};
                        solve(move, steps);

                        steps.add("Two meat eaters cross on the boat.");
                        move = new int[]{3,1,0,0,1,1,1};
                        solve(move, steps);

                        steps.add("One vegetarian and one meat eater cross on the boat.");
                        move = new int[]{2,2,0,0,1,-1,1};
                        solve(move, steps);
                    }
                    break;
                //Goes down this path if the boat is on the goal side of the river.
                case 1:
                //Checks if the boat has anybody in it
                if (boatHasPeople(state)) {
                    //Check if vegetarian is in 1st spot on boat
                    if(state[5] == -1) {
                        //Check if vegetarian in 2nd spot on boat
                        if (state[6] == -1) {

                            //Check if meat eater in 2nd spot on boat
                        } else if (state[6] == 1) {

                            //2nd spot on boat must be empty
                        } else {

                        }
                        //Checks if meat eater in 1st spot on boat.
                    } else if(state[5] == 1) {
                        //Check if vegetarian is in 2nd spot on boat
                        if(state[6] == -1) {

                            //Check if meat eater is in 2nd spot on boat.
                        } else if (state[6] == 1) {

                            //2nd spot must be empty
                        } else {

                        }
                        //The 1st spot in the boat must be empty
                    } else {
                        //Checks if vegetarian is in 2nd spot on boat
                        if(state[6] == -1) {

                            //Must be a meat eater in the 2nd spot
                        } else {

                        }
                    }
                    //The boat must be empty
                } else {
                    //Try all possible moves:
                    steps.add("One vegetarian crosses on the boat.");
                    int[] move = {2,3,0,0,0,-1,0};
                    solve(move, steps);

                    steps.add("Two vegetarians cross on the boat.");
                    move = new int[]{1,3,0,0,0,-1,-1};
                    solve(move, steps);

                    steps.add("One meat eater crosses on the boat.");
                    move = new int[]{3,2,0,0,0,1,0};
                    solve(move, steps);

                    steps.add("Two meat eaters cross on the boat.");
                    move = new int[]{3,1,0,0,0,1,1};
                    solve(move, steps);

                    steps.add("One vegetarian and one meat eater cross on the boat.");
                    move = new int[]{2,2,0,0,0,-1,1};
                    solve(move, steps);
                }
                    break;
            }
        }
    }
    //TODO: Add all other illegal states and make sure boat can't cross river by itself.
    /**
     * Checks current state of puzzle for lose conditions, eg:
     *  - Meat eaters outnumber vegetarians on either side where vegetarians are present.
     *  - All meat eaters and vegetarians end up back on the starting side (the puzzle has looped).
     *  - There are a negative number of vegetarians or meat eaters on either side.
     *  - There are more than 3 vegetarians or meat eaters on either side.
     */

    boolean isIllegalState(int[] state) {
        if (state[1] > state[0] && state[0] != 0) {
            return true;
        } else if (state[3] > state[2] && state[2] != 0) {
            return true;
        } else if (state[0] == 3 && state[1] == 0 && isFirstMove == false) {
            return true;
        } else {
            return false;
        }
    }

    boolean boatHasPeople(int[] state) {
        if (state[5] != 0 || state[6] != 0) {
            return true;
        } else {
            return false;
        }
    }
}
