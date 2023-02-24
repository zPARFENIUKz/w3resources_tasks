package Array.Task61;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.fail;

class ArrayTask61Test {

    public static  Stream<Arguments> EverySecondLargerThanItsNeighborsArgumentsProvider() {
        return Stream.of(
                Arguments.of((Object) new Integer[]{1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14}),
                Arguments.of((Object) new Integer[]{4, 2, 5, 7, 3, 1, 6})
        );
    }

    @ParameterizedTest
    @MethodSource("EverySecondLargerThanItsNeighborsArgumentsProvider")
    void everySecondLarderThanItsNeighbors(Integer[] arr) {
        ArrayTask61.everySecondLarderThanItsNeighbors(arr);
        validateEverySecondLargerThanItsNeighbors(arr);
    }

    private static <T extends Comparable<? super T>> void validateEverySecondLargerThanItsNeighbors(T[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i].compareTo(arr[i - 1]) < 0)
                fail(String.format("element on index %d must be greater than it's neighbors", i));
            if (i + 1 < arr.length && arr[i].compareTo(arr[i + 1]) < 0)
                fail(String.format("element on index %d must be greater than it's neighbors", i));
        }
    }
}