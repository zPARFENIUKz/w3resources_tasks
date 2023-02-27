package Array.Task68;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTask68Test {

    public static Stream<Arguments> getAllPossiblePermutationsArgumentsProvider() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3), 6),
                Arguments.of(List.of(1, 2, 3, 4), 24),
                Arguments.of(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 3628800)
        );
    }

    @ParameterizedTest
    @MethodSource("getAllPossiblePermutationsArgumentsProvider")
    <T> void getAllPossiblePermutations(List<T> lst, int expected) {
        List<List<T>> allPossiblePermutations = ArrayTask68.getAllPossiblePermutations(lst);
        assertEquals(expected, allPossiblePermutations.size());
        assertEquals(new HashSet<>(allPossiblePermutations).size(), allPossiblePermutations.size());
    }
}