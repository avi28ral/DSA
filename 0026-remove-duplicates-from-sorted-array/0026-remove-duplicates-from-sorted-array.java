class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        while(i < nums.length && j < nums.length){
            if(nums[j] == nums[i]){
                j++;
            }else{
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return i + 1;
        
    }
}