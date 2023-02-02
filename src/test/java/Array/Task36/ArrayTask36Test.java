package Array.Task36;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

class ArrayTask36Test {

    @ParameterizedTest
    @ArgumentsSource(TripletsFindArgumentProvider.class)
    void findTargetSumTriplets(final Integer[] arr, final int target) {
        Set<List<Integer>> targetSumTriplets = ArrayTask36.findTargetSumTriplets(arr, target);
        for (final List<Integer> list : targetSumTriplets) {
            for (final Integer val : list) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static class TripletsFindArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
            return Stream.of(
                    Arguments.of(new Integer[]{1, -2, 0, 5, -1, -4}, 2)
            );
        }
    }
}