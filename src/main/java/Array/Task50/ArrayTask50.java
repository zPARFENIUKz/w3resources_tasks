package Array.Task50;

import lombok.NonNull;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTask50 {
    @SuppressWarnings({"unchecked"})
    public static <T extends Comparable<T>> T[] sortSpecificOrder(@NonNull final T[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("arr.length must be at least 2");
        Arrays.sort(arr);
        T[] resultArr = (T[]) Array.newInstance(arr[0].getClass(), arr.length);
        for (int i = 0, j = arr.length - 1; i <= arr.length / 2; ++i, --j) {
            resultArr[Math.min(arr.length - 1, i + (arr.length -1 - j) + 1)] = arr[i];
            final int nextMaxIndex = (arr.length - 1 - j) * 2;
            resultArr[Math.min(arr.length - 1, nextMaxIndex)] = arr[j];
        }
        return resultArr;
    }
}
