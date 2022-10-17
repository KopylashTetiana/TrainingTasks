import FirstPalindrome.FirstPalindrome;
import Sorting.Sorting;
import ZeroMax.ZeroMax;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //Task 1: find first palindrome in String array.
        String [] words = {"apple", "corn", "racecar", "sum", "abba"};
        FirstPalindrome fp = new FirstPalindrome();
        System.out.println(fp.findFirstPalindrome(words));
        /*Task 2: zeroMax. Return a version of the given array where each zero value in the array
         is replaced by the largest odd value to the right of the zero in the array.
          If there is no odd value to the right of the zero, leave the zero as a zero.
        */
        ZeroMax zm = new ZeroMax();
        int []nums = zm.zeroMax(new int[]{0, 6, 9, 0, 3, -1, 0, 1});
        System.out.println(Arrays.toString(nums));
        //Task Sorting: BubleSort
        Sorting s = new Sorting();
        int [] array = {3, 9 , 5, 7, 6, 4, 8, 2, 1};
        //s.bubbleSort(array);
        //s.selectionSort(array);
        s.insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
