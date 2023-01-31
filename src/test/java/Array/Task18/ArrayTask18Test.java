package Array.Task18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask18Test {

    @Test
    @SuppressWarnings("ConstantConditions")
    void getSecondSmallest() {
        assertThrows(NullPointerException.class, () -> ArrayTask18.getSecondSmallest(null));
        assertThrows(IllegalStateException.class, () -> ArrayTask18.getSecondSmallest(new Integer[] {1}));
        assertThrows(NullPointerException.class, () -> ArrayTask18.getSecondSmallest(new Integer[] {1, 2, 3, null, 5}));

        final Integer[] arr1 = new Integer[] {1, 2, 3, 4, 5};
        final Integer[] arr2 = new Integer[] {5, 4, 3, 2, 1};
        final Integer[] arr3 = new Integer[] {5, 1, 4, 2, 3};

        assertEquals(2, ArrayTask18.getSecondSmallest(arr1));
        assertEquals(2, ArrayTask18.getSecondSmallest(arr2));
        assertEquals(2, ArrayTask18.getSecondSmallest(arr3));
    }
}