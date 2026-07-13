class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
       List<Integer> numbers = new ArrayList<>();
        
        for(int k =0; k< nums.length; k++){
            if(nums[k] != k+1){
                numbers.add(k+1);
                
            }
        }
        return numbers;
        
    }
}