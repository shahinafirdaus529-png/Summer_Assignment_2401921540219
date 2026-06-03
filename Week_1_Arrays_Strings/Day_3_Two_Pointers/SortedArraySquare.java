class Solution {

    public int[] sortedSquares(int[] nums) {

        int leftSide = 0;
        int rightSide = nums.length - 1;

        int[] answer = new int[nums.length];

        int position = nums.length - 1;

        while(leftSide <= rightSide) {

            int leftSquare = nums[leftSide] * nums[leftSide];
            int rightSquare = nums[rightSide] * nums[rightSide];

            if(leftSquare > rightSquare) {
                answer[position] = leftSquare;
                leftSide++;
            } else {
                answer[position] = rightSquare;
                rightSide--;
            }

            position--;
        }

        return answer;
    }
}
