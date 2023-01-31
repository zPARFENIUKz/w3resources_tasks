package Array.Task18;

import lombok.NonNull;

public class ArrayTask18 {
    public static <T extends Comparable<T>> T getSecondSmallest(@NonNull final T[] arr) {
        if (arr.length < 2) throw new IllegalStateException("arr length must be at least 2 to find the second largest element");
        T min = arr[0];
        T secondSmallest = null;
        for (final @NonNull T val : arr) {
            if (min.compareTo(val) > 0) {
                secondSmallest = min;
                min = val;
            } else {
                if (secondSmallest == null && min.compareTo(val) < 0) secondSmallest = val;
                else if (secondSmallest != null && secondSmallest.compareTo(val) > 0) secondSmallest = val;
            }
        }
        return secondSmallest;
    }
}
