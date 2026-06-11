import java.util.*;

class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> answer = new ArrayList<>();

        backtrack(answer, "", 0, 0, n);

        return answer;
    }

    private void backtrack(
        List<String> answer,
        String current,
        int open,
        int close,
        int n
    ) {

        if(current.length() == n * 2) {

            answer.add(current);

            return;
        }

        if(open < n) {

            backtrack(
                answer,
                current + "(",
                open + 1,
                close,
                n
            );
        }

        if(close < open) {

            backtrack(
                answer,
                current + ")",
                open,
                close + 1,
                n
            );
        }
    }
}
