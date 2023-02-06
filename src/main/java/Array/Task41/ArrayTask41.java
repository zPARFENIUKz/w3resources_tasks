package Array.Task41;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTask41 {
    public static <T extends Comparable<T>> List<T> getSmallestAndTheSecondSmallest(@NonNull final T[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("arr length must be at least 2");
        List<T> smallest = new ArrayList<>(2);
        for (int i = 1; i < arr.length; ++i) {
            if (smallest.isEmpty()) {
                if (arr[i].compareTo(arr[i - 1]) < 0) {
                    smallest.add(arr[i - 1]);
                    smallest.add(arr[i]);
                } else if (arr[i].compareTo(arr[i - 1]) != 0) {
                    smallest.add(arr[i]);
                    smallest.add(arr[i - 1]);
                } else {
                    smallest.add(arr[i]);
                }
            } else {
                if (smallest.size() > 1 && smallest.get(1).compareTo(arr[i]) > 0) {
                    smallest.remove(0);
                    smallest.add(arr[i]);
                } else if (smallest.get(0).compareTo(arr[i]) > 0) {
                    smallest.set(0, arr[i]);
                } else if (smallest.size() < 2 && smallest.get(0).compareTo(arr[i]) != 0) {
                    smallest.add(arr[i]);
                }
            }
        }
        return smallest;
    }

    public static <T extends Comparable<T>> List<T> getSmallestAndTheSecondSmallestSortVersion(@NonNull final T[] arr) {
        return Arrays.stream(arr).distinct().sorted().collect(Collectors.toList()).subList(0, 2);
    }
}
