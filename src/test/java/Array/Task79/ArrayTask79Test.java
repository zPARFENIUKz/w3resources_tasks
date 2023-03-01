package Array.Task79;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTask79Test {

    public static Stream<Arguments> getMissingLetterArgumentsProvider() {
        return Stream.of(
                Arguments.of(new Character[] {'A', 'B', 'D', 'E'}, 'C'),
                Arguments.of(new Character[] {'a', 'b', 'c', 'e'}, 'd'),
                Arguments.of(new Character[] {'p', 'r', 's', 't'}, 'q')
        );
    }

    @ParameterizedTest
    @MethodSource("getMissingLetterArgumentsProvider")
    void getMissingLetter(final Character[] arr, final Character expected) {
        assertEquals(expected, ArrayTask79.getMissingLetter(arr));
    }
}