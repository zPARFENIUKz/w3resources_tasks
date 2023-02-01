package Array.Task26;

import lombok.NonNull;

public class ArrayTask26 {
    public static int[] moveAllZerosMemVersion(@NonNull final int[] arr) {
        if (arr.length == 1) return arr;
        int[] resultArr = new int[arr.length];
        for (int i = 0, j = 0; j < arr.length;) {
            if (i < arr.length) {
                if (arr[i] == 0) {
                    ++i;
                } else {
                    resultArr[j++] = arr[i++];
                }
            } else {
                resultArr[j++] = 0;
            }
        }
        return resultArr;
    }
}
