public class SameEnds {

//    Given a string, return the longest substring that appears at both the beginning and end of the string
//    without overlapping. For example, sameEnds("abXab") is "ab".
//
//
//    sameEnds("abXYab") → "ab"
//    sameEnds("xx") → "x"
//    sameEnds("xxx") → "x"

    public String sameEnds(String string) {
        String leftHalfString = string.substring(0, string.length() / 2);
        String rightHalfString = string.length() % 2 == 0 ? string.substring(string.length() / 2) :
                                    string.substring(string.length() / 2 + 1);

        if (leftHalfString.equals(rightHalfString)) {
            return leftHalfString;
        }

        for (int l = leftHalfString.length() - 1, r = 0; l > 0; l--, r++) {
            String currentLeftHalfString = leftHalfString.substring(0, l);
            String currentRightHalfString = rightHalfString.substring(1 + r);
            if (currentLeftHalfString.equals(currentRightHalfString)) {
                return currentLeftHalfString;
            }
        }
        return "";
    }
}
