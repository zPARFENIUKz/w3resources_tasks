package Array.Task14;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayTask14Test {

    @Test
    void getCommon() {
        final Integer[] arr1 = IntStream.rangeClosed(1, 7).boxed().toArray(Integer[]::new);
        final Integer[] arr2 = IntStream.range(5, 10).boxed().toArray(Integer[]::new);
        final List<Integer> commons = Arrays.stream("567".split("")).map(Integer::parseInt).toList();

        assertThrows(NullPointerException.class, () -> ArrayTask14.getCommon(null, arr2));
        assertThrows(NullPointerException.class, () -> ArrayTask14.getCommon(arr1, null));

        assertEquals(commons, ArrayTask14.getCommon(arr1, arr2));
    }
}