package Array.Task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask9Test {
    @Test
    @SuppressWarnings("ConstantConditions")
    void insert() {
        final Integer[] arr = new Integer[] {1, 2, 3, 4, 5};
        assertThrows(NullPointerException.class, () -> ArrayTask9.insert(null, 1, 0));
        assertThrows(NullPointerException.class, () -> ArrayTask9.insert(arr, null, 0));
        assertThrows(IndexOutOfBoundsException.class, () -> ArrayTask9.insert(arr, 1, -1));
        assertThrows(IndexOutOfBoundsException.class, () -> ArrayTask9.insert(arr, 1, 5));

        assertArrayEquals(ArrayTask9.insert(arr, 0, 2), new Integer[] {1, 2, 0, 3, 4, 5});
        assertArrayEquals(ArrayTask9.insert(arr, 0, 0), new Integer[] {0, 1, 2, 3, 4, 5});
        assertArrayEquals(ArrayTask9.insert(arr, 0, 4), new Integer[] {1, 2, 3, 4, 0, 5});
    }
}