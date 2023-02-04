package Array.Task39;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask39Test {

    @ParameterizedTest
    @ArgumentsSource(GetLeaderArgumentsProvider.class)
    <T extends Comparable<T>> void getLeadersIterationVersion(final T[] arr, final List<T> expected) {
        assertEquals(expected, ArrayTask39.getLeaders(arr));
    }


    public static class GetLeaderArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
            return Stream.of(
                    Arguments.of(new Integer[] {10, 9, 14, 23, 15, 0, 9}, List.of(23, 15, 9)),
                    Arguments.of(new Integer[] {1}, List.of(1))
            );
        }
    }
}