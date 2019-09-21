public class ZeroMax {
//    Return a version of the given array
//    where each zero value in the array
//    is replaced by the largest odd value to the right of the zero in the array.
//    If there is no odd value to the right of the zero, leave the zero as a zero.
//
//
//    zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
//    zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
//    zeroMax([0, 1, 0]) → [1, 1, 0]

    public int[] zeroMax(int[] nums) {
        int[] resultArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                resultArray[i] = maxOdd(nums, i);
            } else {
                resultArray[i] = nums[i];
            }
        }
        return resultArray;
    }

    private int maxOdd(int[] array, int startIndex) {
        int maxOddValue = 0;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] > maxOddValue &&
                    array[i] % 2 != 0) {
                maxOddValue = array[i];
            }
        }
        return maxOddValue;
    }
}
