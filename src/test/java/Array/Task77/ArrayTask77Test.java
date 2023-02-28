package Array.Task77;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTask77Test {

    public static Stream<Arguments> isAlternativesBetweenPosAndNegArgumentsProvider() {
        return Stream.of(
                Arguments.of(new Integer[]{1, -2, 5, -4, 3, -6}, true),
                Arguments.of(new Integer[]{1, 2, 5, 4, 3, 6}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("isAlternativesBetweenPosAndNegArgumentsProvider")
    void isAlternativesBetweenPosAndNeg(final Integer[] arr, final boolean expected) {
        assertEquals(expected, ArrayTask77.isAlternativesBetweenPosAndNeg(arr));
    }
}