public class TenRun {
//    For each multiple of 10 in the given array,
//    change all the values following it to be that multiple of 10,
//    until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
//
//
//    tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
//    tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
//    tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]

    public int[] tenRun(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int modTen = 0;
            if (nums[i] % 10 != 0) {
                arr[i] = nums[i];
            }
            if (nums[i] % 10 == 0) {
                modTen = nums[i];
                arr[i] = modTen;
                i++;

                while(i < nums.length &&
                        nums[i] % 10 != 0 &&
                        modTen != 0) {
                    arr[i] = modTen;
                    i++;
                }
            }
            if (i == nums.length) break;
            if (nums[i] % 10 == 0 &&
                    modTen != 0) {
                i--;
            }
        }
        return arr;
    }

}
