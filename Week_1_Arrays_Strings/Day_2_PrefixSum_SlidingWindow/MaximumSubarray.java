class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int bestSum = nums[0];

        for(int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            if(currentSum > bestSum) {
                bestSum = currentSum;
            }
        }

        return bestSum;
    }
}
