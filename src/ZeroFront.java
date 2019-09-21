import java.util.Arrays;

public class ZeroFront {
//    Return an array that contains the exact
//    same numbers as the given array, but rearranged
//    so that all the zeros are grouped at the start of the array.
//    The order of the non-zero numbers does not matter. So {1, 0, 0, 1}
//    becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
//
//
//    zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
//    zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
//    zeroFront([1, 0]) → [0, 1]

    public int[] zeroFront(int[] nums) {
        if (nums.length < 2) return nums;

        Arrays.sort(nums);

        return nums[0] < 0 ? sortMethod(nums) : nums;
    }

    private int[] sortMethod(int[] array) {
        multiplyMinusOne(array);

        Arrays.sort(array);

        multiplyMinusOne(array);

        return array;
    }

    private static void multiplyMinusOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * (-1);
        }
    }
}
