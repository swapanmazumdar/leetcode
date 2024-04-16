/**
 * Given an integer num, return the number of steps to reduce it to zero.
 * <p>
 * In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: num = 14
 * Output: 6
 * Explanation:
 * Step 1) 14 is even; divide by 2 and obtain 7.
 * Step 2) 7 is odd; subtract 1 and obtain 6.
 * Step 3) 6 is even; divide by 2 and obtain 3.
 * Step 4) 3 is odd; subtract 1 and obtain 2.
 * Step 5) 2 is even; divide by 2 and obtain 1.
 * Step 6) 1 is odd; subtract 1 and obtain 0.
 * Example 2:
 * <p>
 * Input: num = 8
 * Output: 4
 * Explanation:
 * Step 1) 8 is even; divide by 2 and obtain 4.
 * Step 2) 4 is even; divide by 2 and obtain 2.
 * Step 3) 2 is even; divide by 2 and obtain 1.
 * Step 4) 1 is odd; subtract 1 and obtain 0.
 * Example 3:
 * <p>
 * Input: num = 123
 * Output: 12
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= num <= 106
 */
public class NumberOfStepsToReduceANumberToZero {

    public int numberOfSteps(int num) {
        if (num < 0) {
            throw new IllegalArgumentException();
        }
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
                steps++;
            } else {
                num--;
                steps++;
            }
        }
        return steps;
    }

    public int numberOfStepsUsingCountingBits(int num) {
        String binaryString = Integer.toBinaryString(num);
        int steps = 0;
        for (char bit : binaryString.toCharArray()) {
            if (bit == '1') {
                steps = steps + 2;
            }
            if (bit == '0') {
                steps++;
            }
        }
        return --steps;
    }
}
