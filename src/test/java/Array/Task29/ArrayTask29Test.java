package Array.Task29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.IntStream;


class ArrayTask29Test {
    @Test
    void test() {
        final Random random = new Random();
        final int[] arr = IntStream.range(0, 1_000_000).map(val -> random.nextInt(100_000)).toArray();

        long startTime = System.currentTimeMillis();
        int averageV1 = ArrayTask29.getAverageV1(arr);
        System.out.println("V1: " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        int averageV2 = ArrayTask29.getAverageV2(arr);
        System.out.println("V2: " + (System.currentTimeMillis() - startTime));

        Assertions.assertEquals(averageV1, averageV2);
    }
}