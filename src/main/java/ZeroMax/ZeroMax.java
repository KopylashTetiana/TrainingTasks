package ZeroMax;

import org.jetbrains.annotations.NotNull;

import static java.lang.Math.max;

public class ZeroMax {

    //this method is faster than zeroMax2()
    public int[] zeroMax(int [] nums) {
        if (nums == null) {
            System.out.println("The input array is null, nullable array cannot be processd.");
        } else {
            int maxOdd = Integer.MIN_VALUE;
            boolean wasOdd = false;
            for (int i = nums.length - 1; i >= 0; i--) {
                if ((nums[i] % 2) != 0) {
                    maxOdd = max(nums[i], maxOdd);
                    wasOdd = true;
                }
                if (nums[i] == 0 && wasOdd) {
                    nums[i] = maxOdd;
                }
            }
        }
        return nums;
    }
    //this method spends more time than zeroMax()
    public int[] zeroMax2(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                for(int j = i+1; j < nums.length; j++) {
                    if((nums[j] % 2) != 0) {
                        nums[i] = (nums[i] == 0) ? nums[j] : max(nums[i], nums[j]);

                    }
                }
            }
        }
        return nums;
    }

}
