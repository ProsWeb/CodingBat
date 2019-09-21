public class EqualIsNot {

//    Given a string, return true if the number of appearances of "is" anywhere in the string
//    is equal to the number of appearances of "not" anywhere in the string (case sensitive).
//
//
//    equalIsNot("This is not") → false
//    equalIsNot("This is notnot") → true
//    equalIsNot("noisxxnotyynotxisi") → true

    public boolean equalIsNot(String str) {

        return count(str, "is") == count(str, "not");
    }

    private int count(String string, String word) {
        int countWord = 0;

        for (int i = 0; i < string.length() - (word.length() - 1); i++) {
            String currentSubstring = string.substring(i, i + word.length());
            if (currentSubstring.equals(word)) {
                countWord++;
            }
        }
        return countWord;
    }
}
