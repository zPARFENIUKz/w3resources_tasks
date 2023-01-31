package Array.Task24;

import lombok.NonNull;

public class ArrayTask24 {
    public static Integer getMissingNumber(@NonNull final int[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("arr must contain at least 2 elements");
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] != arr[i - 1] + 1) {
                return arr[i - 1] + 1;
            }
        }
        return null;
    }


}
