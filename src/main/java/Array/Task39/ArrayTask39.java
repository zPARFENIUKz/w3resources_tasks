package Array.Task39;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTask39 {
    public static <T extends Comparable<T>> List<T> getLeaders(@NonNull final T[] arr) {
        List<T> leaders = new ArrayList<>();
        for (int i = 0; i < arr.length; ++i) {
            final T rightMax = Arrays.stream(arr, i + 1, arr.length)
                    .max(Comparable::compareTo).orElse(null);
            if (rightMax == null) leaders.add(arr[arr.length - 1]);
            else {
                if (arr[i].compareTo(rightMax) > 0) leaders.add(arr[i]);
            }
        }
        return leaders;
    }
}
