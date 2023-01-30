package Array.Task11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask11Test {

    @Test
    void reverseArray() {
        assertThrows(NullPointerException.class, () -> ArrayTask11.reverseArray(null));
        final Integer[] arr = new Integer[] {1, 2, 3, 4, 5};
        ArrayTask11.reverseArray(arr);
        assertArrayEquals(new Integer[] {5, 4, 3, 2, 1}, arr);
    }
}