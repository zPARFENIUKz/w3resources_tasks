package Array.Task58;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

class ArrayTask58Test {

    @ParameterizedTest
    @ArgumentsSource(SortMaintainigOrderArgumentsProvider.class)
    void sortMaintainingOrder(int[] A, int[] B, int[] expectedA, int[] expectedB) {
        ArrayTask58.sortMaintainingOrder(A, B);
        Assertions.assertArrayEquals(expectedA, A);
        Assertions.assertArrayEquals(expectedB, B);
    }

    private static class SortMaintainigOrderArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(
                    Arguments.of(new int[] {1, 5, 6, 7, 8, 10}, new int[] {2, 4, 9}, new int[] {1, 2, 4, 5, 6, 7}, new int[] {8, 9, 10})
            );
        }
    }
}