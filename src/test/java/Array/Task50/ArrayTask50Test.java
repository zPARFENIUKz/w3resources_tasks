package Array.Task50;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayTask50Test {

    @ParameterizedTest
    @ArgumentsSource(SortSpecificOrderArgumentsProvider.class)
    void sortSpecificOrder(final Integer[] arr, final Integer[] expected) {
        assertArrayEquals(expected, ArrayTask50.sortSpecificOrder(arr));
    }

    public static class SortSpecificOrderArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
            return Stream.of(
                    Arguments.of(new Integer[] {1, 2, 3, 4, 5}, new Integer[] {5, 1, 4, 2, 3}),
                    Arguments.of(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new Integer[] {10, 1, 9, 2, 8, 3, 7, 4, 6, 5}),
                    Arguments.of(new Integer[] {1, 2}, new Integer[] {2, 1})
            );
        }
    }
}