public class Solution {

    public void reverseString(char[] letters) {

        int leftPointer = 0;
        int rightPointer = letters.length - 1;

        while(leftPointer < rightPointer) {

            char temp = letters[leftPointer];

            letters[leftPointer] = letters[rightPointer];

            letters[rightPointer] = temp;

            leftPointer++;
            rightPointer--;
        }
    }
}
