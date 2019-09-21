public class WordEnds {

//    Given a string and a non-empty word string,
//    return a string made of each char just before and just
//    after every appearance of the word in the string.
//    Ignore cases where there is no char before or after the word,
//    and a char may be included twice if it is between two words.
//
//
//    wordEnds("abcXY123XYijk", "XY") → "c13i"
//    wordEnds("XY123XY", "XY") → "13"
//    wordEnds("XY1XY", "XY") → "11"

    public String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int wordLength = word.length();
        int strLength = str.length();

        for (int i = 0; i <= strLength - wordLength; i++) {
            String substring = str.substring(i, i + wordLength);
            if (wordLength == strLength) {
                return result.toString();
            }

            if (substring.equals(word) &&
                    i == 0) {
                result.append(str.charAt(i + wordLength));
            } else if (substring.equals(word) &&
                    i == strLength - wordLength) {
                result.append(str.charAt(i - 1));
            } else if (substring.equals(word)) {
                result.append(str.charAt(i - 1));
                result.append(str.charAt(i + wordLength));
            }
        }
        return result.toString();
    }
}
