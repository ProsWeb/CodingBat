public class MaxBlock {

//    Given a string, return the length of the largest "block" in the string.
//    A block is a run of adjacent chars that are the same.
//
//
//    maxBlock("hoopla") → 2
//    maxBlock("abbCCCddBBBxx") → 3
//    maxBlock("") → 0

    public int maxBlock(String str) {
        if (str.length() == 0) return 0;
        int finalCount = 0;
        int preFinalCount = 0;

        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            char prevChar = str.charAt(i - 1);
            if (currentChar == prevChar) preFinalCount++;
            if (preFinalCount > finalCount) finalCount = preFinalCount;
            if (currentChar != prevChar) preFinalCount = 0;
        }
        return finalCount + 1;
    }
}
