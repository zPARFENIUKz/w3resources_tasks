package Array.Task43;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTask43Test {

    @ParameterizedTest
    @ArgumentsSource(getFourGiverInSumTargetArgumentsProvider.class)
    void getFourGivesInSumTarget(Integer[] arr, int target, Set<List<Integer>> expected) {
        assertEquals(expected, ArrayTask43.getFourGivesInSumTarget(arr, target));
    }

    public static class getFourGiverInSumTargetArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
            return Stream.of(
                    Arguments.of(new Integer[] {5, -5, 5, -5}, 0, Set.of(List.of(-5, -5, 5, 5))),
                    Arguments.of(new Integer[] {1, 1, 5, 2, 3, 5, 6, 3, 9, 0, 0, 0, 0}, 10, Set.of(
                            List.of(1, 1, 2, 6),
                            List.of(0, 2, 3, 5),
                            List.of(0, 1, 3, 6),
                            List.of(0, 0, 1, 9),
                            List.of(0, 0, 5, 5),
                            List.of(1, 1, 3, 5))
                    )
            );
        }
    }
}