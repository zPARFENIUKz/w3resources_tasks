package Array.Task42;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask42Test {

    @ParameterizedTest
    @ArgumentsSource(segregateTestArgumentsProvider.class)
    void segregate0sAnd1s(int[] arr, int[] expected) {
        ArrayTask42.segregate0sAnd1s(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void exceptionsTest() {
        assertThrows(NullPointerException.class, () -> ArrayTask42.segregate0sAnd1s(null));
        assertThrows(IllegalArgumentException.class, () -> ArrayTask42.segregate0sAnd1s(new int[] {1, 1, 0, 0, 2}));
    }

    public static class segregateTestArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
            int[] arr = IntStream.range(0, 1_000_000).map(i -> i % 2).toArray();
            return Stream.of(
                    Arguments.of(arr, Arrays.stream(arr).sorted().toArray())
            );
        }
    }
}