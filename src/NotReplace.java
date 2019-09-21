public class NotReplace {
//    Given a string, return a string where every appearance of the lowercase word "is"
//    has been replaced with "is not".
//    The word "is" should not be immediately preceeded or followed by a letter --
//    so for example the "is" in "this" does not count.
//
//
//    notReplace("is test") → "is not test"
//    notReplace("is-is") → "is not-is not"
//    notReplace("This is right") → "This is not right"

    public String notReplace(String str) {
        if (str.length() < 2) return str;
        StringBuilder replacedStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char curCharStr = str.charAt(i);
            if (!Character.isLetter(curCharStr)) {
                String lastTwoCharsInReplacedStr = replacedStr.substring(replacedStr.length() - 2);
                if (lastTwoCharsInReplacedStr.equals("is") &&
                        replacedStr.length() >= 3 &&
                        !Character.isLetter(replacedStr.charAt(replacedStr.length() - 3))) {
                    replacedStr.append(" not");
                    replacedStr.append(str, i, i + 1);
                } else if (lastTwoCharsInReplacedStr.equals("is") &&
                        replacedStr.length() < 3) {
                    replacedStr.append(" not");
                    replacedStr.append(str, i, i + 1);
                } else {
                    replacedStr.append(str, i, i + 1);
                }
            } else {
                replacedStr.append(str, i, i + 1);
            }
        }

        String lastTwoCharsInReplacedStr = replacedStr.substring(replacedStr.length() - 2, replacedStr.length());
        if (lastTwoCharsInReplacedStr.equals("is") &&
                replacedStr.length() >= 3 &&
                !Character.isLetter(replacedStr.charAt(replacedStr.length() - 3))) {
            replacedStr.append(" not");
        } else if (lastTwoCharsInReplacedStr.equals("is") &&
                replacedStr.length() < 3) {
            replacedStr.append(" not");
        }
        return replacedStr.toString();
    }
}
