package Array.Task77;

import lombok.NonNull;

public class ArrayTask77 {
    public static boolean isAlternativesBetweenPosAndNeg(@NonNull final Integer[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("arr length must be at least 2");
        final boolean isFirstPositive = arr[0] >= 0;
        for (int i = 1; i <= arr.length; ++i) {
            if (isFirstPositive) {
                if (i % 2 == 1) {
                    if (arr[i - 1] < 0) return false;
                } else if (arr[i - 1] >= 0) return false;
            } else {
                if (i % 2 == 1) {
                    if (arr[i - 1] >= 0) return false;
                } else if (arr[i - 1] < 0) return false;
            }
        }
        return true;
    }
}
