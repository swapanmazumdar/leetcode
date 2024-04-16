import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOfStepsToReduceANumberToZeroTest {

    @Test
    public void shouldReduceToCorrectNumberOfSteps() {
        assertEquals(1, new NumberOfStepsToReduceANumberToZero().numberOfSteps(1));
        assertEquals(2, new NumberOfStepsToReduceANumberToZero().numberOfSteps(2));
        assertEquals(3, new NumberOfStepsToReduceANumberToZero().numberOfSteps(3));
        assertEquals(3, new NumberOfStepsToReduceANumberToZero().numberOfSteps(4));
        assertEquals(6, new NumberOfStepsToReduceANumberToZero().numberOfSteps(14));
        assertEquals(4, new NumberOfStepsToReduceANumberToZero().numberOfSteps(8));
        assertEquals(12, new NumberOfStepsToReduceANumberToZero().numberOfSteps(123));

        assertEquals(1, new NumberOfStepsToReduceANumberToZero().numberOfStepsUsingCountingBits(1));
        assertEquals(2, new NumberOfStepsToReduceANumberToZero().numberOfStepsUsingCountingBits(2));
        assertEquals(3, new NumberOfStepsToReduceANumberToZero().numberOfStepsUsingCountingBits(3));
        assertEquals(3, new NumberOfStepsToReduceANumberToZero().numberOfStepsUsingCountingBits(4));
        assertEquals(6, new NumberOfStepsToReduceANumberToZero().numberOfStepsUsingCountingBits(14));
        assertEquals(4, new NumberOfStepsToReduceANumberToZero().numberOfStepsUsingCountingBits(8));
        assertEquals(12, new NumberOfStepsToReduceANumberToZero().numberOfStepsUsingCountingBits(123));
    }
}
