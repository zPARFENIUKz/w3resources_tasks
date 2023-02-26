package Array.Task64;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayTask64Test {

    public static Stream<Arguments> getLargestBitonicSubarrayArgumentsProvider() {
        return Stream.of(
                Arguments.of(new Integer[] { 4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5 }, new Integer[] {5, 6, 10, 11, 9, 6, 4}),
                Arguments.of(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8}, new Integer[] {1, 2, 3, 4, 5, 6, 7, 8}),
                Arguments.of(new Integer[] {8, 7, 6, 5, 4, 3, 2, 1}, new Integer[] {8, 7, 6, 5, 4, 3, 2, 1}),
                Arguments.of(new Integer[] {4, 1, 2, 3, 4, 3, 2, 1, 5, 6, 7, 8, 9, 19, 9, 7, 6, 5, 4, 3, 1}, new Integer[] {1, 5, 6, 7, 8, 9, 19, 9, 7, 6, 5, 4, 3, 1})

        );
    }

    @ParameterizedTest
    @MethodSource("getLargestBitonicSubarrayArgumentsProvider")
    <T extends Comparable<? super T>> void getLargestBitonicSubarray(final T[] arr, final T[] expected) {
        System.out.println(Arrays.toString(ArrayTask64.getLargestBitonicSubarray(arr)));
        assertArrayEquals(expected, ArrayTask64.getLargestBitonicSubarray(arr));
    }
}