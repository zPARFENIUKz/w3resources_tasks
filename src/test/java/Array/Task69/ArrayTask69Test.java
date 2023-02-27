package Array.Task69;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTask69Test {

    public static Stream<Arguments> getMinSpecificSizeSubArraySumArgumentsProvider() {
        return Stream.of(
                Arguments.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9,10}, 4, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("getMinSpecificSizeSubArraySumArgumentsProvider")
    void getMinSpecificSizeSubArraySum(final Integer[] arr, final int subArrSize, final long expected) {
        assertEquals(expected, ArrayTask69.getMinSpecificSizeSubArraySum(arr, subArrSize));
    }
}