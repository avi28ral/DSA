class Solution {
    public int reverseBits(int n) {
      int nums = 0;
      for(int i =0; i<32; i++){
        nums <<= 1;
        nums = n&1 | nums;
        n >>= 1;
      }
      return nums;
    }
}