package Array.Task59;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayTask59Test {

    @ParameterizedTest
    @ArgumentsSource(GetMaxProductParentsArgumentsProvider.class)
    void getMaxProductParents(int[] arr, Map.Entry<Integer, Integer> expected) {
        assertEquals(expected, ArrayTask59.getMaxProductParents(arr));
    }

    private static class GetMaxProductParentsArgumentsProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
            return Stream.of(
                    Arguments.of(new int[] {2, 3, 5, 7, -7, 5, 8, -5}, new AbstractMap.SimpleEntry<>(7, 8)),
                    Arguments.of(new int[] {1, 2}, new AbstractMap.SimpleEntry<>(1, 2)),
                    Arguments.of(new int[] {5, 5, 5, 5, 5, 5, 5, 4, 7}, new AbstractMap.SimpleEntry<>(5, 7))
            );
        }
    }
}