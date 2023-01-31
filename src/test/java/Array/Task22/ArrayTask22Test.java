package Array.Task22;

import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTask22Test {

    @Test
    void getPairsThanGivesInSum() {
        final int[] arr1 = new int[] {1, 2, 3, 4, 5};
        final Set<Map.Entry<Integer, Integer>> res1 = new HashSet<>() {{   // sum = 5
            add(new AbstractMap.SimpleEntry<>(1, 4));
            add(new AbstractMap.SimpleEntry<>(2, 3));
        }};
        final Set<Map.Entry<Integer, Integer>> res2 = new HashSet<>();  // sum = 10

        final int[] arr2 = new int[] {1, -2, -1, 2, 4, -3, 3, -4};
        final Set<Map.Entry<Integer, Integer>> res3 = new HashSet<>() {{   // sum = 0
            add(new AbstractMap.SimpleEntry<>(-1, 1));
            add(new AbstractMap.SimpleEntry<>(-2, 2));
            add(new AbstractMap.SimpleEntry<>(-3, 3));
            add(new AbstractMap.SimpleEntry<>(-4, 4));
        }};

        final int[] arr3 = new int[] {1, 2};
        final Set<Map.Entry<Integer, Integer>> res4 = new HashSet<>() {{   // sum = 3
            add(new AbstractMap.SimpleEntry<>(1, 2));
        }};


        assertThrows(NullPointerException.class, () -> ArrayTask22.getPairsThanGivesInSum(null, 5));
        assertThrows(IllegalArgumentException.class, () -> ArrayTask22.getPairsThanGivesInSum(new int[1], 5));

        assertEquals(res1, ArrayTask22.getPairsThanGivesInSum(arr1, 5));
        assertEquals(res2, ArrayTask22.getPairsThanGivesInSum(arr1, 10));
        assertEquals(res3, ArrayTask22.getPairsThanGivesInSum(arr2, 0));
        assertEquals(res4, ArrayTask22.getPairsThanGivesInSum(arr3, 3));
    }
}