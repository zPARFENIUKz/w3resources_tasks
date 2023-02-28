package Array.Task74;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTask74Test {

    public static Stream<Arguments> findTripletsWithSumArgumentsProvider() {
        final Set<List<Integer>> expected1 = new HashSet<>() {{
            add(List.of(0, 1, 6));
            add(List.of(0, 3, 4));
        }};
        return Stream.of(
                Arguments.of(new Integer[]{1, 6, 3, 0, 8, 4, 1, 7}, 7, expected1)
        );
    }

    @ParameterizedTest
    @MethodSource("findTripletsWithSumArgumentsProvider")
    void findTripletsWithSum(final Integer[] arr, final long sum, final Set<List<Integer>> expected) {
        assertEquals(expected, ArrayTask74.findTripletsWithSum(arr, sum));
    }
}