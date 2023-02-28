package Array.Task73;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayTask73Test {

    public static Stream<Arguments> sortWhereTwoUnsortedArgumentsProvider() {
        final Integer[] arr1 = new Integer[]{3, 5, 6, 9, 8, 7};
        final Integer[] arr1sorted = Arrays.stream(arr1).sorted().toArray(Integer[]::new);

        final Integer[] arr2 = new Integer[]{5, 0, 1, 2, 3, 4, -2};
        final Integer[] arr2sorted = Arrays.stream(arr2).sorted().toArray(Integer[]::new);
        return Stream.of(
                Arguments.of(arr1, arr1sorted),
                Arguments.of(arr2, arr2sorted),
                Arguments.of(new Integer[] {2, 1}, new Integer[] {1, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("sortWhereTwoUnsortedArgumentsProvider")
    <T extends Comparable<? super T>> void sortWhereTwoUnsorted(final T[] arr, final T[] expected) {
        assertArrayEquals(expected, ArrayTask73.sortWhereTwoUnsorted(arr));
    }
}