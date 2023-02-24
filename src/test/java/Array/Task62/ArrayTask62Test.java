package Array.Task62;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTask62Test {

    public static Stream<Arguments> getEquilibriumIndexesArgumentsProvider() {
        return Stream.of(
                Arguments.of(new Integer[] {-7, 1, 5, 2, -4, 3, 0}, Set.of(3, 6))
        );
    }

    @ParameterizedTest
    @MethodSource({"getEquilibriumIndexesArgumentsProvider"})
    void getEquilibriumIndexes(Integer[] arr, Set<Integer> expected) {
        assertEquals(expected, ArrayTask62.getEquilibriumIndexes(arr));
    }


}