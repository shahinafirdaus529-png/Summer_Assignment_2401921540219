public class Solution {

    public boolean isPalindrome(String text) {

        int start = 0;
        int end = text.length() - 1;

        while(start < end) {

            while(start < end &&
                  !Character.isLetterOrDigit(text.charAt(start))) {

                start++;
            }

            while(start < end &&
                  !Character.isLetterOrDigit(text.charAt(end))) {

                end--;
            }

            char leftChar = Character.toLowerCase(text.charAt(start));
            char rightChar = Character.toLowerCase(text.charAt(end));

            if(leftChar != rightChar) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
