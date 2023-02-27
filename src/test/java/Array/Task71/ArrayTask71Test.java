package Array.Task71;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigInteger;
import java.util.stream.Stream;

class ArrayTask71Test {

    public static Stream<Arguments> getLargestFormedValuesArgumentsProvider() {
        return Stream.of(
                Arguments.of(new Integer[] {1, 2, 3, 0, 4, 6}, new BigInteger("643210"))
        );
    }

    @ParameterizedTest
    @MethodSource("getLargestFormedValuesArgumentsProvider")
    void getLargestFormedValues(final Integer[] arr, final BigInteger expected) {
        Assertions.assertEquals(expected, ArrayTask71.getLargestFormedValues(arr));
    }
}