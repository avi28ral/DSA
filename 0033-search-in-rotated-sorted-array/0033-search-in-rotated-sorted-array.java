class Solution {
    public int search(int[] nums, int target) {
      int pivot =  peak(nums);
      int firstTry = bs(nums, target,0,pivot);
      if(firstTry != -1){
        return firstTry;
      } 
      else{
        return bs(nums, target, pivot+1, nums.length-1);
      } 

        
        
    }
    public int peak(int[] nums){
        int start= 0;
        int end = nums.length -1;
        if(nums.length == 1){
            return 0;
        }
        while(start < end){
            int mid = start+(end - start)/2;
            if(mid < end && nums[mid] > nums[mid +1]){
                return mid;
            }else if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1 ;

            }else if(nums[start] > nums[mid]){
                end = mid -1;
            }else{
                start += 1;
            }
        }
        return -1;

    }
    public int bs(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start +(end - start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}