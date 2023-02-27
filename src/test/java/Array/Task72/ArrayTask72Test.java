package Array.Task72;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayTask72Test {

    public static Stream<Arguments> getUnsortedSubArrayArgumentsProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{1, 2, 3, 0, 4, 6}, new Integer[]{1, 2, 3, 0}),
                Arguments.of(new Integer[]{1, 3, 2, 7, 5, 6, 4, 8}, new Integer[]{3, 2, 7, 5, 6, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("getUnsortedSubArrayArgumentsProvider")
    <T extends Comparable<? super T>> void getUnsortedSubArray(final T[] arr, final T[] expected) {
        assertArrayEquals(expected, ArrayTask72.getUnsortedSubArray(arr));
    }
}