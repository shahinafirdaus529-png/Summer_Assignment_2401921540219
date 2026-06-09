import java.util.*;

class Solution {

    public int lengthOfLongestSubstring(String text) {

        HashSet<Character> uniqueCharacters =
            new HashSet<>();

        int start = 0;

        int answer = 0;

        for(int end = 0; end < text.length(); end++) {

            char currentCharacter = text.charAt(end);

            while(uniqueCharacters.contains(currentCharacter)) {

                uniqueCharacters.remove(
                    text.charAt(start)
                );

                start++;
            }

            uniqueCharacters.add(currentCharacter);

            int currentLength =
                end - start + 1;

            answer = Math.max(answer, currentLength);
        }

        return answer;
    }
}
