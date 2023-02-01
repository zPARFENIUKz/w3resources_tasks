package Array.Task34;

import org.junit.jupiter.api.Test;

class ArrayTask34Test {

    @Test
    void getLongestConsecutiveSequenceLength() {
        final int[] arr = new int[] {49, 1, 3, 200, 2, 4, 70, 5};
        final int result = ArrayTask34.getLongestConsecutiveSequenceLength(arr);
        System.out.println(result);
    }
}