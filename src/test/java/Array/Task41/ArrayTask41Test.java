package Array.Task41;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask41Test {

    @ParameterizedTest
    @ArgumentsSource(getSmallestAndTheSecondSmallestTestArgumentsProvider.class)
    <T extends Comparable<T>> void getSmallestAndTheSecondSmallestTest(final T[] arr, final List<T> expected) {
        assertEquals(expected, ArrayTask41.getSmallestAndTheSecondSmallest(arr).stream().sorted().toList());
    }

    @ParameterizedTest
    @ArgumentsSource(getSmallestAndTheSecondSmallestTestArgumentsProvider.class)
    <T extends Comparable<T>> void getSmallestAndTheSecondSmallestSortVersion(final T[] arr, final List<T> expected) {
        assertEquals(expected, ArrayTask41.getSmallestAndTheSecondSmallestSortVersion(arr).stream().sorted().toList());
    }

    @Test
    void timeComparisonTest() {
        final Random random = new Random();
        final Integer[] arr = IntStream.range(0, 1_000_000).mapToObj(i -> random.nextInt(1000)).toArray(Integer[]::new);
        long startTime = System.currentTimeMillis();
        ArrayTask41.getSmallestAndTheSecondSmallest(arr);
        System.out.println("Algo version: " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        ArrayTask41.getSmallestAndTheSecondSmallestSortVersion(arr);
        System.out.println("Sort version: " + (System.currentTimeMillis() - startTime));
    }

    public static class getSmallestAndTheSecondSmallestTestArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
            return Stream.of(
                    Arguments.of(new Integer[]{1, 2, 3, 4, 5, 6, 7}, List.of(1, 2)),
                    Arguments.of(new Integer[]{7, 6, 5, 4, 3, 2, 1}, List.of(1, 2)),
                    Arguments.of(new Integer[]{1, 2}, List.of(1, 2)),
                    Arguments.of(new Integer[]{1, 7, 5, 3, 4, 2}, List.of(1, 2)),
                    Arguments.of(new Integer[]{1, 1, 1, 2, 2}, List.of(1, 2))
            );
        }
    }
}