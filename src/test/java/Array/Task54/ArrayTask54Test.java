package Array.Task54;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask54Test {

    @ParameterizedTest
    @ArgumentsSource(hasSubArraySumZeroAuthorVersionAtributesProvider.class)
    void hasSubArraySumZeroAuthorVersion(final int[] arr, boolean expected) {
        assertEquals(expected, ArrayTask54.hasSubArraySumZero(arr));
    }

    public static class hasSubArraySumZeroAuthorVersionAtributesProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
            return Stream.of(
                    Arguments.of(new int[] {1, 2, -2, 3, 4, 5, 6}, true),
                    Arguments.of(new int[] {1, 2, 3, 4, 5, 6}, false),
                    Arguments.of(new int[] {1, 2, -3, 4, 5, 6}, true),
                    Arguments.of(new int[] {1, 2, 3, 1, 2, 3}, false)
            );
        }
    }
}