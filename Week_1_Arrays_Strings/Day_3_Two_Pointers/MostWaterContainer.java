class Solution {

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int bestArea = 0;

        while(left < right) {

            int width = right - left;

            int currentHeight = Math.min(height[left], height[right]);

            int currentArea = width * currentHeight;

            bestArea = Math.max(bestArea, currentArea);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return bestArea;
    }
}
