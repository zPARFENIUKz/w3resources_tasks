package Array.Task37;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayTask37Test {

    @Test
    void antiDiagonalsNullTest() {
        assertThrows(NullPointerException.class, () -> ArrayTask37.antiDiagonals(null));
    }

    @ParameterizedTest
    @ArgumentsSource(AntiDiagonalArgumentsProvider.class)
    <T> void antiDiagonalsTest(T[][] arr, T[][] expected) {
        assertArrayEquals(expected, ArrayTask37.antiDiagonals(arr));
    }

    public static class AntiDiagonalArgumentsProvider implements ArgumentsProvider {
        protected static final Integer[][] arr1 = new Integer[][]{};
        protected static final Integer[][] res1 = arr1;

        protected static final Integer[][] arr2 = new Integer[][]{{1}};
        protected static final Integer[][] res2 = arr2;

        protected static final Integer[][] arr3 = new Integer[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        protected static final Integer[][] res3 = new Integer[][]{
                {1},
                {2, 4},
                {3, 5, 7},
                {6, 8},
                {9}
        };

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
            return Stream.of(
                    Arguments.of(arr1, res1),
                    Arguments.of(arr2, res2),
                    Arguments.of(arr3, res3)
            );
        }
    }
}