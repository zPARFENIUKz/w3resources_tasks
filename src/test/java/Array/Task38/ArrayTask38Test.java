package Array.Task38;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayTask38Test {

    @Test
    void getMajorityElementNullTest() {
        assertThrows(NullPointerException.class, () -> ArrayTask38.getMajorityElement(null));
    }

    @ParameterizedTest
    @ArgumentsSource(GetMajorityElementArgumentsProvider.class)
    <T> void getMajorityElementTest(final T[] arr, final T majorityExpected) {
        assertEquals(majorityExpected, ArrayTask38.getMajorityElement(arr));
    }


    public static class GetMajorityElementArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
            return Stream.of(
                    Arguments.of(new Integer[] {}, null),
                    Arguments.of(new Integer[] {1}, 1),
                    Arguments.of(new Integer[] {1, 2, 3, 4, 4, 4, 4}, 4),
                    Arguments.of(new Integer[] {4, 4, 4, 4, 3, 2, 1}, 4),
                    Arguments.of(new Integer[] {1, 2, 3, 4, 4, 4}, null)
            );
        }
    }
}