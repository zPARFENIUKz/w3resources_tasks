package Array.Task53;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayTask53Test {

    @ParameterizedTest
    @ArgumentsSource(replaceEachToNextGreaterRightElementArgumentsProvider.class)
    void replaceEachToNextGreaterRightElement(final Integer[] arr, final Integer[] expected) {
        ArrayTask53.replaceEachToNextGreaterRightElement(arr);
        assertArrayEquals(expected, arr);
    }

    public static class replaceEachToNextGreaterRightElementArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
            return Stream.of(
                    Arguments.of(new Integer[] {45, 20, 100, 23, -5, 2, -6}, new Integer[] {100, 100, 23, 2, 2, -6, null})
            );
        }
    }
}