public class XyzMiddle {

//    Given a string, does "xyz" appear in the middle of the string?
//    To define middle, we'll say that the number of chars to the left
//    and right of the "xyz" must differ by at most one. This problem is harder than it looks.

//
//    xyzMiddle("AAxyzBB") → true
//    xyzMiddle("AxyzBB") → true
//    xyzMiddle("AxyzBBB") → false

    public boolean xyzMiddle(String str) {

        int middleXYZ = (str.length() - 3) / 2;
        if (str.startsWith("xyz", middleXYZ)) {
            return true;
        }

        int indexAfterXYZ = middleXYZ + 1 + 3;
        int countSymbolsAfterXYZ = str.length() - indexAfterXYZ;
        int countSymbolsBeforeXYZ = middleXYZ + 1;
        int diff = Math.abs(countSymbolsAfterXYZ - countSymbolsBeforeXYZ);

        return str.startsWith("xyz", middleXYZ + 1) &&
                diff == 1;
    }
}
