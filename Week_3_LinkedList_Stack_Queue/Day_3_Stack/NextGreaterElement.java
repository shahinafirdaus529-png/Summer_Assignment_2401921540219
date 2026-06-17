import java.util.*;

class Solution {

    public int[] nextGreaterElement(

        int[] nums1,

        int[] nums2
    ) {

        Stack<Integer> stack =
            new Stack<>();

        HashMap<Integer,Integer>
            nextMap =
            new HashMap<>();

        for(
            int value :
            nums2
        ) {

            while(
                !stack.isEmpty()
                &&
                stack.peek()
                < value
            ) {

                nextMap.put(
                    stack.pop(),
                    value
                );
            }

            stack.push(value);
        }

        while(
            !stack.isEmpty()
        ) {

            nextMap.put(
                stack.pop(),
                -1
            );
        }

        int[] answer =
            new int[
                nums1.length
            ];

        for(
            int i = 0;
            i < nums1.length;
            i++
        ) {

            answer[i] =
                nextMap.get(
                    nums1[i]
                );
        }

        return answer;
    }
}
