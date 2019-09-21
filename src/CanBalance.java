public class CanBalance {
//    Given a non-empty array, return true if there is a place to split the array
//    so that the sum of the numbers
//    on one side is equal to the sum of the numbers on the other side.
//
//
//    canBalance([1, 1, 1, 2, 1]) → true
//    canBalance([2, 1, 1, 2, 1]) → false
//    canBalance([10, 10]) → true

    public boolean canBalance(int[] nums) {
        int[] tempArray = new int[10];
        int index = 0;

        while(index != nums.length - 1) {
            tempArray[index] = nums[index];
            if (sumLeft(tempArray, index) == sumRight(nums, index + 1)) {
                return true;
            }
            index++;
        }
        return false;

    }
    private int sumLeft(int[] array, int endIndex) {
        int sum = 0;

        for (int i = 0; i <= endIndex; i++) {
            sum += array[i];
        }
        return sum;
    }

    private int sumRight(int[] array, int startIndex) {
        int sum = 0;

        for (int i = startIndex; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}

