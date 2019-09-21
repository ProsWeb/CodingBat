public class CommonTwo {
//    Start with two arrays of strings, a and b, each in alphabetical order,
//    possibly with duplicates. Return the count of the number
//    of strings which appear in both arrays.
//    The best "linear" solution makes a single pass over both arrays,
//    taking advantage of the fact that they are in alphabetical order.
//
//
//    commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
//    commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
//    commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3

    public int commonTwo(String[] a, String[] b) {
        int count = 0;

        for (int i = 0, j = 0; i < a.length && j < b.length;) {
            String currentA = a[i];
            String currentB = b[j];
            String preA = "";
            String preB = "";

            if (i > 0) {
                preA = a[i - 1];
            }
            if (j > 0) {
                preB = b[j - 1];
            }
            if (currentA.equals(preA)) {
                i++;
                continue;
            }
            if (currentB.equals(preB)) {
                j++;
                continue;
            }

            if (currentA.equals(currentB)) {
                count++;
                i++;
                j++;
            }
            if (currentA.compareTo(currentB) > 0) {
                j++;
            } else if (currentA.compareTo(currentB) < 0) {
                i++;
            }
        }
        return count;
    }
}
