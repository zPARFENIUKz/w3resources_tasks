package Array.Task42;

import lombok.NonNull;

public class ArrayTask42 {
    public static void segregate0sAnd1s(@NonNull final int[] arr) {
        int counter = 0;
        for (final int val : arr) {
            if (val == 0) ++counter;
            else if (val != 1) throw new IllegalArgumentException("arr must contain only 1s and zeros");
        }
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (i < counter)? 0 : 1;
        }
    }
}
