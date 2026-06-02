class Solution {

    public double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;

        for(int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int bestWindow = windowSum;

        for(int end = k; end < nums.length; end++) {

            windowSum += nums[end];
            windowSum -= nums[end - k];

            bestWindow = Math.max(bestWindow, windowSum);
        }

        return (double) bestWindow / k;
    }
}
