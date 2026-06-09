class Solution {

    public boolean checkInclusion(String first, String second) {

        if(first.length() > second.length()) {

            return false;
        }

        int[] firstCount = new int[26];

        int[] secondCount = new int[26];

        for(int i = 0; i < first.length(); i++) {

            firstCount[first.charAt(i) - 'a']++;

            secondCount[second.charAt(i) - 'a']++;
        }

        if(isSame(firstCount, secondCount)) {

            return true;
        }

        for(int index = first.length();
            index < second.length();
            index++) {

            secondCount[second.charAt(index) - 'a']++;

            secondCount[
                second.charAt(index - first.length()) - 'a'
            ]--;

            if(isSame(firstCount, secondCount)) {

                return true;
            }
        }

        return false;
    }

    private boolean isSame(int[] first, int[] second) {

        for(int i = 0; i < 26; i++) {

            if(first[i] != second[i]) {

                return false;
            }
        }

        return true;
    }
}
