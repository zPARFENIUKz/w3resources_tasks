package Array.Task79;

import lombok.NonNull;

public class ArrayTask79 {
    public static Character getMissingLetter(@NonNull final Character[] arr) {
        Integer val = null;
        for (Character character : arr) {
            if (val == null) {
                val = (int) character;
            } else {
                ++val;
                if (val != (int) character) return (char) ((int) val);
            }
        }
        return null;
    }
}
