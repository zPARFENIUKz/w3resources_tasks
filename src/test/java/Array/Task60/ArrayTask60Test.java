package Array.Task60;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ArrayTask60Test {

    @Test
    void shuffle() {
        final int[] arr = new int[] {1, 2, 3, 4, 5};
        ArrayTask60.shuffle(arr);
        System.out.println(Arrays.toString(arr));
    }
}