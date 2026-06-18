import java.util.*;

class Solution {

    public int largestRectangleArea(
        int[] heights
    ) {

        Stack<Integer> positions =
            new Stack<>();

        int maximum =
            0;

        for(
            int current = 0;
            current <= heights.length;
            current++
        ) {

            int currentHeight =
                (
                    current ==
                    heights.length
                )
                ?
                0
                :
                heights[current];

            while(
                !positions.isEmpty()
                &&
                currentHeight
                <
                heights[
                    positions.peek()
                ]
            ) {

                int height =
                    heights[
                        positions.pop()
                    ];

                int width;

                if(
                    positions.isEmpty()
                ) {

                    width =
                        current;
                }

                else {

                    width =
                        current
                        -
                        positions.peek()
                        -
                        1;
                }

                maximum =
                    Math.max(
                        maximum,
                        height * width
                    );
            }

            positions.push(
                current
            );
        }

        return maximum;
    }
}
