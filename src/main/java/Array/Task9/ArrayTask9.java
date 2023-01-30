package Array.Task9;


import lombok.NonNull;

import java.lang.reflect.Array;

@SuppressWarnings("unchecked")
public class ArrayTask9 {
    public static <T> T[] insert(@NonNull final T[] arr, @NonNull final T element, int index) {
        if (index < 0 || index >= arr.length) throw new IndexOutOfBoundsException("index must be greater than 0 and less than arr.length");
        T[] newArr = (T[]) Array.newInstance(element.getClass(), arr.length + 1);
        System.arraycopy(arr, 0, newArr, 0, index);
        newArr[index] = element;
        System.arraycopy(arr, index, newArr, index + 1, arr.length - index);
        return newArr;
    }
}
