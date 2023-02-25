package Array.Task63;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayTask63Test {

    public static Stream<Arguments> getProdsEveryOtherElementsArgumentsProvider() {
        return Stream.of(
                Arguments.of(new int[] {1, 2, 3, 4, 5, 6, 7}, new long[] {5040, 2520, 1680, 1260, 1008, 840, 720}),
                Arguments.of(new int[] {0, 1, 2, 3, 4, 5, 6, 7}, new long[] {5040, 0, 0, 0, 0, 0, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("getProdsEveryOtherElementsArgumentsProvider")
    void getProdsEveryOtherElements(final int[] arr, final long[] expected) {
        assertArrayEquals(expected, ArrayTask63.getProdsEveryOtherElements(arr));
    }
}