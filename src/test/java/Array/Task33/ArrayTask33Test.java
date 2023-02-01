package Array.Task33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask33Test {

    @Test
    void removeDuplicatesV1() {
        final Integer[] arr = new Integer[]{1, 1, 5, 3, 5, 4, 6, 7};
        final int newLength = ArrayTask33.removeDuplicates(arr);
        assertEquals(6, newLength);
        assertArrayEquals(new Integer[]{1, 5, 3, 4, 6, 7, 6, 7}, arr);
    }
}