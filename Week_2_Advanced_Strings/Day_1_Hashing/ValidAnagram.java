public class ValidAnagram {

    public boolean isAnagram(String first, String second) {

        if(first.length() != second.length()) {
            return false;
        }

        int[] frequency = new int[26];

        for(int i = 0; i < first.length(); i++) {

            frequency[first.charAt(i) - 'a']++;

            frequency[second.charAt(i) - 'a']--;
        }

        for(int count : frequency) {

            if(count != 0) {
                return false;
            }
        }

        return true;
    }
}
