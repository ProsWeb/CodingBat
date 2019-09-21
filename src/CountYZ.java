public class CountYZ {

//    Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy"
//    and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
//    We'll say that a y or z is at the end of a word if there is not an alphabetic
//    letter immediately following it.
//
//
//    countYZ("fez day") → 2
//    countYZ("day fez") → 2
//    countYZ("day fyyyz") → 2

    public int countYZ(String str) {
        int count = 0;
        int lastIndex = str.length() - 1;

        for (int i = 0; i < lastIndex; i++) {
            char nextLetter = str.toLowerCase().charAt(i + 1);
            char currentLetter = str.toLowerCase().charAt(i);

            if (currentLetter == 'z' || currentLetter == 'y') {
                if (nextLetter == ' ' ||
                        !Character.isLetter(nextLetter)) {
                    count++;
                }
            }
        }
        char lastLetter = str.toLowerCase().charAt(lastIndex);
        if (lastLetter == 'z' ||
                lastLetter == 'y') {
            count++;
        }
        return count;
    }
}
