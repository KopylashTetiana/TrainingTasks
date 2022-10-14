import java.util.Arrays;

import static org.junit.Assert.*;

public class ZeroMaxTest {

    @org.junit.Test
    public void zeroMax() {
        ZeroMax zm = new ZeroMax();
        assertArrayEquals(new int[] {5, 4, 5, 3, 3}, zm.zeroMax(new int[] {0, 4, 5, 0, 3}));
        assertArrayEquals(new int[] {3, 3, 8, -19, 0}, zm.zeroMax(new int[] {0, 3, 8, -19, 0}));
        assertArrayEquals(new int[] {11, 11, 9, 9, -9}, zm.zeroMax(new int[] {0, 11, 0, 9, -9}));
        assertArrayEquals(new int[] {7, 2, 3, 4, 5, 6, 7}, zm.zeroMax(new int[] {0, 2, 3, 4, 5, 6, 7}));
        assertArrayEquals(new int[] {0, 0, 0}, zm.zeroMax(new int[] {0, 0, 0}));
    }

    @org.junit.Test
    public void zeroMax2() {
    }
}