public class MakeChocolate {

//    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each)
//    and big bars (5 kilos each). Return the number of small bars to use,
//    assuming we always use big bars before small bars. Return -1 if it can't be done.

//    makeChocolate(4, 1, 9) → 4
//    makeChocolate(4, 1, 10) → -1
//    makeChocolate(4, 1, 7) → 2

    public int makeChocolate(int small, int big, int goal) {
        int numberSmall = 0;
        int goalMinusBig = goal - 5 * big;
        if (goalMinusBig == 0) return 0;

        for (int i = 0; i < 100; i++) {
            if (goalMinusBig < 0) {
                goalMinusBig = goalMinusBig + 5;
            }
            if (goalMinusBig > 0 && small > 0) {
                goalMinusBig -= 1;
                small--;
                numberSmall++;
            } else if (goalMinusBig == 0) {
                return numberSmall;
            } else if (small == 0) {
                return -1;
            }
        }
        return -1;
    }
}
