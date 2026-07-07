class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] avgs = new int[nums.length];
        Arrays.fill(avgs,-1);
        long s =0;
        for(int i=0;i<nums.length;i++){
            s += nums[i];
            if(i>=2*k){
                avgs[i-k]= (int)(s/(2*k+1));
                s= s-nums[i-2*k];

            }
        }        
        return avgs;
        
    }
}