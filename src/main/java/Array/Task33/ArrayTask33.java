package Array.Task33;

import lombok.NonNull;

import java.util.Arrays;

public class ArrayTask33 {
    /**
     * @param arr - array than where duplicates will be removed
     * @param <T> - any comparable type
     * @return new length of arr
     */
    @SuppressWarnings("unchecked")
    public static <T extends Comparable<T>> int removeDuplicates(@NonNull final T[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("arr length must be at least 2");
        Object[] objects = Arrays.stream(arr).distinct().toArray();
        for (int i = 0; i < objects.length; ++i) {
            arr[i] = (T) objects[i];
        }
        return objects.length;
    }

}