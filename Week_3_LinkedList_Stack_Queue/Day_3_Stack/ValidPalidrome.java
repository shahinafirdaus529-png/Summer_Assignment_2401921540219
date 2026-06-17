import java.util.*;

class Solution {

    public boolean isValid(String text) {

        Stack<Character> brackets =
            new Stack<>();

        for(char current :
            text.toCharArray()) {

            if(
                current == '(' ||
                current == '{' ||
                current == '['
            ) {

                brackets.push(current);
            }

            else {

                if(
                    brackets.isEmpty()
                ) {

                    return false;
                }

                char top =
                    brackets.pop();

                if(
                    (current == ')' && top != '(')
                    ||
                    (current == '}' && top != '{')
                    ||
                    (current == ']' && top != '[')
                ) {

                    return false;
                }
            }
        }

        return brackets.isEmpty();
    }
}
