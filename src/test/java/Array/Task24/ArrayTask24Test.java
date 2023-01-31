package Array.Task24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask24Test {

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    void getMissingNumber() {
        final int[] arr1 = new int[]{-3, -1, 0, 1, 3, 4, 5, 6};
        final int[] arr2 = new int[]{1, 2, 3, 4, 5, 7};
        final int[] arr3 = new int[]{-3, -2, -1, 1, 2, 3, 4};

        assertThrows(NullPointerException.class, () -> ArrayTask24.getMissingNumber(null));
        assertEquals(-2, ArrayTask24.getMissingNumber(arr1));
        assertEquals(6, ArrayTask24.getMissingNumber(arr2));
        assertEquals(0, ArrayTask24.getMissingNumber(arr3));
    }
}