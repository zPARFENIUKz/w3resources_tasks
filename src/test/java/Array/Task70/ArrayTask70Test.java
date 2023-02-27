package Array.Task70;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTask70Test {

    public static Stream<Arguments> getSmallestLengthOfSubarrayWhichSumLargerThatArgumentsProvider() {
        return Stream.of(
                Arguments.of(new Integer[] {1, 2, 3, 4, 6}, 8, 2),
                Arguments.of(new Integer[] {1, 2, 3, 4, 7}, 7, 1),
                Arguments.of(new Integer[] {1, 2, 3, 4, 5}, 500, 0),
                Arguments.of(new Integer[] {1, 2, 4, 0, 7, 1}, 8, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("getSmallestLengthOfSubarrayWhichSumLargerThatArgumentsProvider")
    void getSmallestLengthOfSubarrayWhichSumLargerThat(final Integer[] arr, final long sum, final int expected) {
        assertEquals(expected, ArrayTask70.getSmallestLengthOfSubarrayWhichSumLargerThat(arr, sum));
    }
}