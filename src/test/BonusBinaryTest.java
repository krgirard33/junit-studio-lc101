package test;

import main.BonusBinarySearch;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BonusBinaryTest {
    @Test
    public void testOne() {
        int[] arr = {18,1,5,7,3};
        //Arrays.sort(arr);
        assertEquals("5 is at index 2",BonusBinarySearch.binarySearch(arr,5),2);
    }

    @Test
    public void testTwo() {
        int[] arr = {10,9,8,7,6,5,11};
        int foundAt = BonusBinarySearch.binarySearch(arr,8);
        assertEquals("8 is at index 3",foundAt,3);
    }

}
