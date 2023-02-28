package Array.Task75;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTask75Test {

    public static Stream<Arguments> getLargestGapArgumentsProvider() {
        return Stream.of(
                Arguments.of(new Integer[] {1, 2 ,9, 0, 4, 6}, 3),
                Arguments.of(new Integer[] {23, -2, 45, 38, 12, 4, 6}, 15)
        );
    }

    @ParameterizedTest
    @MethodSource("getLargestGapArgumentsProvider")
    void getLargestGap(final Integer[] arr, final int expected) {
        assertEquals(expected, ArrayTask75.getLargestGap(arr));
    }
}