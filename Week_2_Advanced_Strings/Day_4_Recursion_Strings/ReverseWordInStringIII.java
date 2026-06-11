class Solution {

    public String reverseWords(String s) {

        String[] words = s.split(" ");

        StringBuilder answer = new StringBuilder();

        for(String word : words) {

            StringBuilder reversed =
                new StringBuilder(word);

            answer.append(reversed.reverse()).append(" ");
        }

        return answer.toString().trim();
    }
}
