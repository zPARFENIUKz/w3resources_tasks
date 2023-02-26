package Array.Task65;

import lombok.NonNull;

public class ArrayTask65 {
    public static long getMaxDiffSuchThatSmallerAppearsBeforeLarger(@NonNull final int[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("arr must contains at least 2 elements");
        int minIndex = 0;
        int max = arr[0];
        long maxDiff = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                if (maxDiff < arr[i]) {
                    max = arr[i];
                    maxDiff = max - arr[minIndex];
                }
            } else if (arr[i] < arr[minIndex]) {
                minIndex = i;
                max = arr[minIndex];
            }
        }
        return maxDiff;
    }
}
