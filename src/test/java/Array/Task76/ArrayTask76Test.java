package Array.Task76;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask76Test {

    public static Stream<Arguments> isArrConsecutiveArgumentsProvider() {
        return Stream.of(
                Arguments.of(new Integer[] {1, 2, 5, 0, 4, 3, 6}, true),
                Arguments.of(new Integer[] {1, 2, 5, 0, 3, 6, 7}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("isArrConsecutiveArgumentsProvider")
    void isArrConsecutiveSortVersion(final Integer[] arr, final boolean expected) {
        assertEquals(expected, ArrayTask76.isArrConsecutiveSortVersion(arr));
    }

    @ParameterizedTest
    @MethodSource("isArrConsecutiveArgumentsProvider")
    void isArrConsecutiveHashSetVersion(final Integer[] arr, final boolean expected) {
        assertEquals(expected, ArrayTask76.isArrConsecutiveHashSetVersion(arr));
    }

    @Test
    void timeComparisonTest() {
        final List<Integer> lst = new java.util.ArrayList<>(IntStream.range(0, 1_000_000)
                .boxed()
                .toList());
        Collections.shuffle(lst);
        final Integer[] arr = lst.toArray(Integer[]::new);
        long startTime = System.currentTimeMillis();
        ArrayTask76.isArrConsecutiveHashSetVersion(arr);
        long time = System.currentTimeMillis() - startTime;
        System.out.println("HashSet Version: " + time);
        startTime = System.currentTimeMillis();
        ArrayTask76.isArrConsecutiveSortVersion(arr);
        time = System.currentTimeMillis() - startTime;
        System.out.println("Sort Version: " + time);
    }
}