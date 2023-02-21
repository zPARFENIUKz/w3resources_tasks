package Array.Task58;

import lombok.NonNull;

import java.util.Arrays;

public class ArrayTask58 {
    public static void sortMaintainingOrder(@NonNull final int[] A, @NonNull final int[] B) {
        final int[] arr = new int[A.length + B.length];
        System.arraycopy(A, 0, arr, 0, A.length);
        System.arraycopy(B, 0, arr, A.length, B.length);
        Arrays.sort(arr);
        System.arraycopy(arr, 0, A, 0, A.length);
        System.arraycopy(arr, A.length, B, 0, B.length);
    }
}
