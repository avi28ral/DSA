class Solution {
    public int searchInsert(int[] a, int target) {
        int start = 0;
        int end = a.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(a[mid] == target){
                return mid;
            }
            if(a[mid] > target){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}