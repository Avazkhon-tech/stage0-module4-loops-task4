package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bi" +
                    "gger then the last");
            return;
        }

        // Case 3.2: lastInRow is negative
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }

        // Case 3.3: Calculate skipped sum and counted sum
        int skippedSum = 0;
        int countedSum = 0;

        for (int i = 1; i <= lastInRow; i++) {
            if (i <= numberToSkip) {
                skippedSum += i;
            } else {
                countedSum += i;
            }
        }

        System.out.println("skipped sum is " + skippedSum);
        System.out.println("counted sum is " + countedSum);
    }


}

