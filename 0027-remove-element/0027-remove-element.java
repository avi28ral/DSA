class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        while(i<nums.length && j< nums.length){
            if(nums[j] == val){
                j++;
            }
            else{
                nums[i++] = nums[j];
                j++;
            }
        }
        return i;
        
        
    }
}