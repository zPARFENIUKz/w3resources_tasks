package Array.Task67;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTask67Test {

    public static Stream<Arguments> getLargestContiguousSubarraySumInCircularArrArgumentsProvider() {
        return Stream.of(
                Arguments.of(new int[] { 2, 1, -5, 4, -3, 1, -3, 4, -1 }, 6),
                Arguments.of(new int[] { 1, -2, 3, 0, 7, 8, 1, 2, -3 }, 21),
                Arguments.of(new int[] {-1, -2, -3, -4}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("getLargestContiguousSubarraySumInCircularArrArgumentsProvider")
    void getLargestContiguousSubarraySumInCircularArr(final int[] arr, final long expected) {
        assertEquals(expected, ArrayTask67.getLargestContiguousSubarraySumInCircularArr(arr));
    }
}