//Java Program by Alex Bledsoe, 04/07/2017

public class DieRoll {

    public static void main(String[] args) {
        int[] rollTotals = new int[11];
        for (int i = 0; i < 50; i++) {
            Die d1 = new Die();
            Die d2 = new Die();
            switch (d1.getCurrentNumber() + d2.getCurrentNumber()) {
                case 2:
                    rollTotals[0]++;
                    break;
                case 3:
                    rollTotals[1]++;
                    break;
                case 4:
                    rollTotals[2]++;
                    break;
                case 5:
                    rollTotals[3]++;
                    break;
                case 6:
                    rollTotals[4]++;
                    break;
                case 7:
                    rollTotals[5]++;
                    break;
                case 8:
                    rollTotals[6]++;
                    break;
                case 9:
                    rollTotals[7]++;
                    break;
                case 10:
                    rollTotals[8]++;
                    break;
                case 11:
                    rollTotals[9]++;
                    break;
                default:
                    rollTotals[10]++;
                    break;
            }
        }
        System.out.println("      Die Roll Results");
        System.out.println("------------------------------");
        for (int i = 0; i < rollTotals.length; i++) {
            System.out.println((i + 2) + "\twas rolled " + rollTotals[i] + "\ttimes.");
        }
    }

}
