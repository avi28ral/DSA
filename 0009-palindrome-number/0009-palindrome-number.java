class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int rev = 0;
        int n = x;
        while(n > 0){
            int digit = n % 10;
            n /= 10;
            rev = rev * 10 + digit;
        }
        if(rev == x){
            return true;
        }else{
            return false;
        }
        
    }
}