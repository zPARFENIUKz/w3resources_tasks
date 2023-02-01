package Array.Task25;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask25Test {

    @Test
    void getCommon() {
        final Integer[] arr1_1 = new Integer[] {1, 3, 5, 7, 9};
        final Integer[] arr1_2 = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final Integer[] arr1_3 = new Integer[] {1, 7, 8};


        assertThrows(NullPointerException.class, () -> ArrayTask25.getCommon(null, arr1_2, arr1_3));
        assertThrows(NullPointerException.class, () -> ArrayTask25.getCommon(arr1_1, null, arr1_3));
        assertThrows(NullPointerException.class, () -> ArrayTask25.getCommon(arr1_1, arr1_2, null));

        assertEquals(List.of(1, 7), ArrayTask25.getCommon(arr1_1, arr1_2, arr1_3));
    }
}