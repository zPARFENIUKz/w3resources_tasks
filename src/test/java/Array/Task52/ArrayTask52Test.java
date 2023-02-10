package Array.Task52;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayTask52Test {

    @ParameterizedTest
    @MethodSource("evenFirstTestArgumentsProvider")
    void evenFirst(final int[] arr) {
        ArrayTask52.evenFirst(arr);
        assertTrue(checkEvenFirst(arr));
    }

    public static Stream<int[]> evenFirstTestArgumentsProvider() {
        return Stream.of(
                new int[] {10, 12, 23, 17, 7, 8, 10, 2, 1, 0},
                new int[] {5, 4, 6, 9, -1, -2, 4, 5, 7, 13}
        );
    }

    public static boolean checkEvenFirst(final int[] arr) {
        boolean isEvenEnded = false;
                for (final int val : arr) {
                    if (val % 2 == 1) isEvenEnded = true;
                    else if (val % 2 == 0 && isEvenEnded) return false;
                }
                return true;
    }

}