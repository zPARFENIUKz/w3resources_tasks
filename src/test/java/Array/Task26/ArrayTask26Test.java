package Array.Task26;

import org.junit.jupiter.api.Test;

    import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayTask26Test {

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    void moveAllZeros() {
        final int[] arr = new int[] {1, 0, 5, 3, 0, 2, 3, 0, 7, 9, 0};
        int[] ints = ArrayTask26.moveAllZerosMemVersion(arr);
        assertArrayEquals(new int[] {1, 5, 3, 2, 3, 7, 9, 0, 0, 0, 0}, ints);

        // Time comparison
        final Random random = new Random();
        int[] timeTestArray = IntStream.range(0, 1_000_000).map(val -> random.nextInt(100)).toArray();
        long startTime = System.currentTimeMillis();
        ArrayTask26.moveAllZerosMemVersion(timeTestArray);
        System.out.println("memVersion: " + (System.currentTimeMillis() - startTime));
    }
}