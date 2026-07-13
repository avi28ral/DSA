class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int j = 1;
        for(int i =0; i < 2*n; i++){
            if(i%2 == 0){
                ans[i] =  nums[i/2];
            }else{
                ans[i] = nums[n+j-1];
                j++;
            }
        }
        return ans;
    }
}