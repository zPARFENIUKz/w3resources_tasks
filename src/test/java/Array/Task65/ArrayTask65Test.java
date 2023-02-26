package Array.Task65;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTask65Test {
    public static Stream<Arguments> getMaxDiffSuchThatSmallerAppearsBeforeLargerArgumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 1, 7, 9, 5, 11, 3, 5}, 10),
                Arguments.of(new int[] {5, 3, 4, 5, 6, 7, 8, 1, 9, 11}, 10),
                Arguments.of(new int[] {1, 9, 11, 5, 4, 5, 7, 6, 8, 9}, 10),
                Arguments.of(new int[] {5, 6, 7, 9, 10, 1}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("getMaxDiffSuchThatSmallerAppearsBeforeLargerArgumentsProvider")
    void getMaxDiffSuchThatSmallerAppearsBeforeLarger(final int[] arr, final long expected) {
        assertEquals(expected, ArrayTask65.getMaxDiffSuchThatSmallerAppearsBeforeLarger(arr));
    }
}