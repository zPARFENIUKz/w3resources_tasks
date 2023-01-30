package Array.Task11;

import lombok.NonNull;

public class ArrayTask11 {
    public static <T> void reverseArray(@NonNull T[] arr) {
        for (int i = 0; i < arr.length / 2; ++i) {
            final T buff = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = buff;
        }
    }
}
