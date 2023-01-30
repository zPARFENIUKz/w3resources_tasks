package Array.Task10;

import org.junit.jupiter.api.Test;

import java.util.AbstractMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArrayTask10Test {

    @Test
    void findMinAndMax() {
        assertThrows(NullPointerException.class, () -> ArrayTask10.findMinAndMax(null));

        final Integer[] arr1 = new Integer[] {null, -1, 3, 2, -2, 3, 4, 5, -3};
        final Integer[] arr2 = new Integer[] {null};
        final Integer[] arr3 = new Integer[] {2, 3, 1, 5, 6, 3};

        assertEquals(new AbstractMap.SimpleEntry<>(-3, 5), ArrayTask10.findMinAndMax(arr1));
        assertEquals(new AbstractMap.SimpleEntry<Integer, Integer>(null, null), ArrayTask10.findMinAndMax(arr2));
        assertEquals(new AbstractMap.SimpleEntry<>(1, 6), ArrayTask10.findMinAndMax(arr3));
    }
}