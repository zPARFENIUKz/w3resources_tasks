package Array.Task59;

import lombok.NonNull;

import java.util.AbstractMap;
import java.util.Map;

public class ArrayTask59 {
    public static Map.Entry<Integer, Integer> getMaxProductParents(@NonNull final int[] arr) {
        if (arr.length < 2) throw new IllegalStateException("arr length must be at least 2");
        int nextUniqueElementIndex = 1;
        while (nextUniqueElementIndex < arr.length && arr[0] == arr[nextUniqueElementIndex]) ++nextUniqueElementIndex;
        if (nextUniqueElementIndex == arr.length) throw new IllegalStateException("arr must contains at least 2 different values");
        int secondMax = Math.min(arr[0], arr[nextUniqueElementIndex]);
        int max = Math.max(arr[0], arr[nextUniqueElementIndex]);
        for (int i = nextUniqueElementIndex + 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
        }

        return new AbstractMap.SimpleEntry<>(secondMax, max);
    }
}
