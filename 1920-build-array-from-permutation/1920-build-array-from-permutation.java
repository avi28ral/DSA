class Solution {
    public int[] buildArray(int[] nums) {
        int size = nums.length ;
        int ans[] = new int [size];
        for(int i=0 ;i< size; i++){
           int temp = nums[i];
            ans[i] = nums[temp];
            
        }
        return ans;

        
    }
}