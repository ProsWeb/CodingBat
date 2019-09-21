public class NotAlone {
//    We'll say that an element in an array is "alone"
//    if there are values before and after it,
//    and those values are different from it.
//    Return a version of the given array where every instance
//    of the given value which is alone is replaced by whichever value to its left or right is larger.
//
//
//    notAlone([1, 2, 3], 2) → [1, 3, 3]
//    notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
//    notAlone([3, 4], 3) → [3, 4]

    public int[] notAlone(int[] nums, int val) {
        if (nums.length == 0) return nums;
        int[] array = new int[nums.length];

        array[0] = nums[0];
        int lastElementIndex = nums.length - 1;

        for (int i = 1; i < lastElementIndex; i++) {
            int currElement = nums[i];
            int nextElement = nums[i + 1];
            int prevElement = nums[i - 1];

            if (currElement == val &&
                    currElement != prevElement &&
                    currElement != nextElement) {
                array[i] = Math.max(prevElement, nextElement);
            } else {
                array[i] = currElement;
            }
        }
        array[lastElementIndex] = nums[lastElementIndex];

        return array;
    }
}
