package Array.Task10;

import lombok.NonNull;

import java.util.AbstractMap;
import java.util.Map;

public class ArrayTask10 {
    @SuppressWarnings("ConstantConditions")
    public static <T extends Comparable<T>> Map.Entry<T, T> findMinAndMax(@NonNull T[] arr) {
        T min = arr[0];
        T max = min;
        for (final T val : arr) {
            if (val == null) continue;
            if (min == null || min.compareTo(val) > 0) min = val;
            if (max == null || max.compareTo(val) < 0) max = val;
        }
        return new AbstractMap.SimpleEntry<>(min, max);
    }
}
