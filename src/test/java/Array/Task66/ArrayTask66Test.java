package Array.Task66;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTask66Test {

    public static Stream<Arguments> getLargestContiguousSubarraySumArgumentsProvider() {
        return Stream.of(
                Arguments.of(new int[] {1, 2, -3, -4, 0, 6, 7, 8, 9}, 30),
                Arguments.of(new int[] {-1, -2, -3, -4, -8, -7, 5}, 5),
                Arguments.of(new int[] {-1, -2, -3, -4, -8, -7}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("getLargestContiguousSubarraySumArgumentsProvider")
    void getLargestContiguousSubarraySum(final int[] arr, final long expected) {
        assertEquals(expected, ArrayTask66.getLargestContiguousSubarraySum(arr));
    }
}