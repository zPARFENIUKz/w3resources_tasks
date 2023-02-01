package Array.Task25;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

public class ArrayTask25 {
    public static <T extends Comparable<T>> List<T> getCommon(@NonNull final T[] arr1, @NonNull final T[] arr2, @NonNull final T[] arr3) {
        List<T> common = new ArrayList<>();
        for (int i = 0, j = 0, k = 0;i < arr1.length && j < arr2.length && k < arr3.length;) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                common.add(arr1[i]);
                ++i;
                ++j;
                ++k;
            } else {
                if (arr1[i].compareTo(arr2[j]) < 0) {
                    ++i;
                } else if (arr2[j].compareTo(arr3[k]) < 0) {
                    ++j;
                } else {
                    ++k;
                }
            }
        }
        return common;
    }
}
