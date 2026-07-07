class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;
        for(int i =0;i < k;i++){
            sum += nums[i];
        }
        int currSum = sum;
        int maxSum = sum;
        for(int i =1; i <= nums.length - k; i++){
            currSum = currSum - nums[i-1] + nums[i+k-1];
            maxSum = Math.max(currSum,maxSum);
        }
        return (double)maxSum/k;
        
        
    }
}