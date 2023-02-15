package Array.Task56;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask56Test {

    @Test
    void nullPointerTest() {
        assertThrows(NullPointerException.class, () -> ArrayTask56.sortBinaries(null));
    }

    @Test
    void illegalValuesTest() {
        assertThrows(IllegalArgumentException.class, () -> ArrayTask56.sortBinaries(new int[] {1, 0, 1, 1, 1, 0, 0, 0, 2}));
    }
    @ParameterizedTest
    @ArgumentsSource(SortBinariesArgumentsProvider.class)
    void sortBinaries(final int[] arr, final int[] expected) {
        ArrayTask56.sortBinaries(arr);
        assertArrayEquals(expected, arr);
    }

    private static class SortBinariesArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(
                    Arguments.of(new int[] {1, 1, 1, 1, 0, 0, 0, 0}, new int[] {0, 0, 0, 0, 1, 1, 1, 1}),
                    Arguments.of(new int[] {1, 0, 1, 0, 1, 0, 1, 0}, new int[] {0, 0, 0, 0, 1, 1, 1, 1}),
                    Arguments.of(new int[] {0, 0, 0, 1, 1, 1, 0, 1}, new int[] {0, 0, 0, 0, 1, 1, 1, 1})
            );
        }
    }
}