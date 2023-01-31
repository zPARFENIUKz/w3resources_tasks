package Array.Task17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask17Test {

    @SuppressWarnings("ConstantConditions")
    @Test
    void getSecondLargest() {
        assertThrows(NullPointerException.class, () -> ArrayTask17.getSecondLargest(null));
        assertThrows(NullPointerException.class, () -> ArrayTask17.getSecondLargest(new Integer[] {1, 2, null, 4, 3, 6, 5}));

        final Integer[] arr1 = new Integer[]{4, 5, 3, 2, 1, 6};
        final Integer[] arr2 = new Integer[]{6, 4, 5, 3, 1, 2};
        final Integer[] arr3 = new Integer[]{5, 4, 3, 2, 1, 0};
        assertEquals(5, ArrayTask17.getSecondLargest(arr1));
        assertEquals(5, ArrayTask17.getSecondLargest(arr2));
        assertEquals(4, ArrayTask17.getSecondLargest(arr3));

    }
}