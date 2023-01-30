package Array.Task16;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayTask16Test {

    @Test
    void removeDuplicates() {
        assertThrows(NullPointerException.class, () -> ArrayTask16.removeDuplicates(null));
        final Random random = new Random();
        final Integer[] arr = IntStream.range(0, 1_000_000)
                .boxed()
                .map(val -> random.nextInt(1000))
                .toArray(Integer[]::new);
        final Integer[] result = Arrays.stream(arr).distinct().sorted().toArray(Integer[]::new);
        assertArrayEquals(result, Arrays.stream(ArrayTask16.removeDuplicates(arr)).sorted().toArray(Integer[]::new));
    }
}