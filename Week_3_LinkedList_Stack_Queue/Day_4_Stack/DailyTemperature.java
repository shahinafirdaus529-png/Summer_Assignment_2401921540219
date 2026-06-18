import java.util.*;

class Solution {

    public int[] dailyTemperatures(
        int[] temperatures
    ) {

        int size =
            temperatures.length;

        int[] answer =
            new int[size];

        Stack<Integer> indices =
            new Stack<>();

        for(
            int current = 0;
            current < size;
            current++
        ) {

            while(
                !indices.isEmpty()
                &&
                temperatures[current]
                >
                temperatures[
                    indices.peek()
                ]
            ) {

                int previous =
                    indices.pop();

                answer[previous] =
                    current
                    -
                    previous;
            }

            indices.push(
                current
            );
        }

        return answer;
    }
}
