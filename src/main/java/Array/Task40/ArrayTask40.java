package Array.Task40;

import lombok.NonNull;

import java.util.AbstractMap;
import java.util.Map;

public class ArrayTask40 {
    public static Map.Entry<Integer, Integer> getElementsWhichSumIsClosestToZero(@NonNull final Integer[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("arr length must be at least 2");
        Map.Entry<Integer, Integer> pair = null;
        Integer minZeroDiff = null;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (pair == null) {
                    pair = new AbstractMap.SimpleEntry<>(arr[i], arr[j]);
                    minZeroDiff = Math.abs(arr[i] + arr[j]);
                } else {
                    final long currMin = Math.abs(arr[i] + arr[j]);
                    if (currMin < minZeroDiff) {
                        pair = new AbstractMap.SimpleEntry<>(arr[i], arr[j]);
                        minZeroDiff = (int) currMin;
                    }
                }
            }
        }
        return pair;
    }
}
