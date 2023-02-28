package Array.Task74;

import lombok.NonNull;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class ArrayTask74 {
    public static Set<List<Integer>> findTripletsWithSum(@NonNull final Integer[] arr, final long sum) {
        Set<List<Integer>> resultSet = new HashSet<>();
        for (int i = 0; i < arr.length; ++i) {
            final long diff = sum - arr[i];
            for (int j = 0; j < arr.length; ++j) {
                if (j != i) {
                    final int last = (int) diff - arr[j];
                    for (int k = 0; k < arr.length; ++k) {
                        if (k != i && k != j) {
                            if (arr[k] == last) {
                                resultSet.add(Stream.of(arr[i], arr[j], arr[k]).sorted().toList());
                            }
                        }
                    }
                }
            }
        }
        return resultSet;
    }

}
