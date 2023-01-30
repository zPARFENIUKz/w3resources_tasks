package Array.Task12;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayTask12Test {

    @Test
    void findDuplicates() {
        final Integer[] arr = new Integer[] {1, 1, 5, 2, 3, 5, 2, 6, 7, 8, 9, 9, null, null};
        Set<Integer> set = Arrays.stream("1259".split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
        set.add(null);
        assertEquals(set, ArrayTask12.findDuplicates(arr));
        assertThrows(NullPointerException.class, () -> ArrayTask12.findDuplicates(null));
    }
}