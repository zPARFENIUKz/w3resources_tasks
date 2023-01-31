package Array.Task17;

import lombok.NonNull;

public class ArrayTask17 {
    public static <T extends Comparable<T>> T getSecondLargest(@NonNull final T[] arr) {
        if (arr.length < 2) throw new IllegalStateException("arr length must be at least 2 to find the second largest element");
        T max = arr[0];
        T secondLargest = null;
        // There must be NonNull check because we can't compare anything to null
        // {4, 6, 5, }
        for (final @NonNull T val : arr) {
            if (val.compareTo(max) > 0) {
                secondLargest = max;
                max = val;
            } else {
                if (secondLargest == null && val.compareTo(max) < 0) secondLargest = val;
                else if (secondLargest != null && secondLargest.compareTo(val) < 0) secondLargest = val;
            }
        }
        return secondLargest;
    }
}
