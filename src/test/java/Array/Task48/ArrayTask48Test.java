package Array.Task48;

import lombok.NonNull;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayTask48Test {


    @ParameterizedTest
    @MethodSource("rearrangeArrayNegativeFirstArgumentsProvider")
    void rearrangeArrayNegativeFirst(final int[] arr) {
        ArrayTask48.rearrangeArrayNegativeFirst(arr);
        assertTrue(checkNegativeFirst(arr));
    }

    public static Stream<int[]> rearrangeArrayNegativeFirstArgumentsProvider() {
        return Stream.of(
                new int[]{1, 5, -2, 5, -1, -3, 7},
                new int[]{1, 1, 1, 1, 1, -1, -1},
                new int[]{-3, -2, -1, 0, 1, 2, 3}
        );
    }

    public static boolean checkNegativeFirst(@NonNull final int[] arr) {
        boolean lastNegativeFound = false;
        for (final int val : arr) {
            if (val >= 0) lastNegativeFound = true;
            else {
                if (lastNegativeFound) return false;
            }
        }
        return true;
    }
}