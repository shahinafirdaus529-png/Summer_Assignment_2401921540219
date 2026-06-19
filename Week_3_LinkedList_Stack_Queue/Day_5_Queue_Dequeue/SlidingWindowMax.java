import java.util.*;

class Solution {

    public int[] maxSlidingWindow(
        int[] numbers,
        int window
    ) {

        Deque<Integer> indices =
            new LinkedList<>();

        int[] answer =
            new int[
                numbers.length
                -
                window
                +
                1
            ];

        int position = 0;

        for(
            int current = 0;
            current < numbers.length;
            current++
        ) {

            while(
                !indices.isEmpty()
                &&
                indices.peekFirst()
                <=
                current - window
            ) {

                indices.pollFirst();
            }

            while(
                !indices.isEmpty()
                &&
                numbers[
                    indices.peekLast()
                ]
                <=
                numbers[current]
            ) {

                indices.pollLast();
            }

            indices.offerLast(
                current
            );

            if(
                current
                >=
                window - 1
            ) {

                answer[position++] =
                    numbers[
                        indices.peekFirst()
                    ];
            }
        }

        return answer;
    }
}
