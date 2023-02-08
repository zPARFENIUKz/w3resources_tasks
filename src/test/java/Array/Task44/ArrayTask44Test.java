package Array.Task44;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayTask44Test {

    @Test
    void getTriangles() {
        Assertions.assertEquals(17, ArrayTask44.getPossibleTrianglesCount(new int[]{6, 7, 9, 16, 25, 12, 30, 40}));
    }
}