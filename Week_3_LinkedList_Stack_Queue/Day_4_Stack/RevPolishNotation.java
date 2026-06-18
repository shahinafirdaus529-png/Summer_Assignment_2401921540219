import java.util.*;

class Solution {

    public int evalRPN(
        String[] tokens
    ) {

        Stack<Integer> values =
            new Stack<>();

        for(
            String current :
            tokens
        ) {

            if(
                current.equals("+")
            ) {

                values.push(
                    values.pop()
                    +
                    values.pop()
                );
            }

            else if(
                current.equals("-")
            ) {

                int second =
                    values.pop();

                int first =
                    values.pop();

                values.push(
                    first - second
                );
            }

            else if(
                current.equals("*")
            ) {

                values.push(
                    values.pop()
                    *
                    values.pop()
                );
            }

            else if(
                current.equals("/")
            ) {

                int second =
                    values.pop();

                int first =
                    values.pop();

                values.push(
                    first / second
                );
            }

            else {

                values.push(
                    Integer.parseInt(
                        current
                    )
                );
            }
        }

        return values.pop();
    }
}
