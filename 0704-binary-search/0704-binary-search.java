class Solution {
    public int search(int[] nums, int target) {
        return BS(nums, target, 0, nums.length -1);
        
    }
    static int BS(int[] arr, int T, int S, int E){
        if(S>E) return -1;
        int M = S+(E-S)/2;
        if(arr[M] == T) return M;
        if(arr[M] > T){
            return BS(arr, T, S, M-1);
        }else{
            return BS(arr, T, M+1, E);
        }
        
    }
}