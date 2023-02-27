package Array.Task69;

import lombok.NonNull;

public class ArrayTask69 {
    public static long getMinSpecificSizeSubArraySum(@NonNull final Integer[] arr, final int subArrSize) {
        if (subArrSize > arr.length) throw new IllegalArgumentException("subArrSize must be less or equals to arr.length");
        long sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (i <= subArrSize - 1) {
                sum += arr[i];
            } else {
                final long newSum = sum + arr[i] - arr[i - (subArrSize - 1)];
                if (newSum < sum) sum = newSum;
            }
        }
        return sum;
    }
}
