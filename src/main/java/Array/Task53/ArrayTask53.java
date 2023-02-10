package Array.Task53;

import lombok.NonNull;

public class ArrayTask53 {
    @SuppressWarnings("DataFlowIssue")
    public static <T extends Comparable<T>> void replaceEachToNextGreaterRightElement(@NonNull final T[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("arr.length must be al least 2");
        T maxRight = arr[arr.length - 1];
        arr[arr.length - 1] = null;
        for (int i = arr.length - 2; i >= 0; i--) {
            final T temp = maxRight;
            if (arr[i].compareTo(maxRight) > 0) maxRight = arr[i];
            arr[i] = temp;
        }
    }
}
