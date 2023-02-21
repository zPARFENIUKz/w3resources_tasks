package Array.Task57;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayTask57Test {

    @ParameterizedTest
    @ArgumentsSource(FindmaxConsecutiveArgumentsProvider.class)
    void findMaxConsecutive(int[] arr, int[] expected) {
        assertArrayEquals(expected, ArrayTask57.findMaxConsecutive(arr));
    }

    private static class FindmaxConsecutiveArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(
                    Arguments.of(new int[] {2, 5, 0, 2, 1, 4, 3, 6, 1, 0}, new int[] {5, 0, 2, 1, 4, 3, 6}),
                    Arguments.of(new int[] {5, 1, 4, 2, 3, 2, 0, 7, 4, 5, 1, 2, 3, 6}, new int[] {0, 7, 4, 5, 1, 2, 3, 6}),
                    Arguments.of(new int[] {}, new int[] {}),
                    Arguments.of(new int[] {1}, new int[] {1}),
                    Arguments.of(new int[] {2, 1}, new int[] {2, 1})
            );
        }
    }
}