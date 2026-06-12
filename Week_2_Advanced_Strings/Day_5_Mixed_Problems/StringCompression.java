public class Solution {

    public int compress(char[] characters) {

        int index = 0;
        int current = 0;

        while(current < characters.length) {

            char currentCharacter = characters[current];

            int count = 0;

            while(current < characters.length &&
                  characters[current] == currentCharacter) {

                current++;
                count++;
            }

            characters[index++] = currentCharacter;

            if(count > 1) {

                for(char digit : Integer.toString(count).toCharArray()) {

                    characters[index++] = digit;
                }
            }
        }

        return index;
    }
}
