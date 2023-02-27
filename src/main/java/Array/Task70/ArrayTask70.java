package Array.Task70;

import lombok.NonNull;

public class ArrayTask70 {
    public static int getSmallestLengthOfSubarrayWhichSumLargerThat(@NonNull final Integer[] arr, final long sum) {
        Integer minLength = null;
        int localLength = 0;
        long localSum = 0;
        for (int i = 0; i < arr.length; ++i) {
            ++localLength;
            localSum += arr[i];
            if (localSum >= sum) {
                if (minLength == null || localLength < minLength) {
                    minLength = localLength;
                    while (localSum >= sum) {
                        --localLength;
                        localSum -= arr[i - localLength];
                        if (localLength < minLength) {
                            minLength = localLength;
                        }
                    }
                }
            }
        }
        return minLength != null? minLength : 0;
    }
}
