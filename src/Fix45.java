public class Fix45 {

//    Return an array that contains exactly the same numbers as the given array,
//    but rearranged so that every 4 is immediately followed by a 5.
//    Do not move the 4's, but every other number may move.
//    The array contains the same number of 4's and 5's,
//    and every 4 has a number after it that is not a 4. In this version,
//    5's may appear anywhere in the original array.
//
//
//    fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
//    fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
//    fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]


    public int[] fix45(int[] nums) {
        int[] array = new int[nums.length];

        int sizeOfTempArray = 0;
        int lastElementIndex = 0;
        int[] tempArray = new int[10];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                array[i] = nums[i];
                array[i + 1] = 5;

                if (nums[i + 1] != 5) {
                    tempArray[sizeOfTempArray] = nums[i + 1];
                    sizeOfTempArray++;
                }
                i++;
            } else if (nums[i] == 5) {
                if (sizeOfTempArray == lastElementIndex) {
                    tempArray[lastElementIndex] = findAfterFour(nums, i);
                    sizeOfTempArray++;
                }
                array[i] = tempArray[lastElementIndex];
                lastElementIndex++;
            } else {
                array[i] = nums[i];
            }
        }
        return array;
    }
    private int findAfterFour(int[] arr, int pos) {
        for (int i = pos; i < arr.length; i++) {
            if (arr[i] == 4 && arr[i + 1] != 5) {
                return arr[i + 1];
            }
        }
        return -1;
    }
}
