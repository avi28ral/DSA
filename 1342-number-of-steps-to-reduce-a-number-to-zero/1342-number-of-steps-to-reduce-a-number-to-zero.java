class Solution {
    int step = 0;
    public int numberOfSteps(int num) {
        
        if(num==0){
            return step;
        }
        if(num%2==0){
            num /= 2;
            step++;
            numberOfSteps(num);
        }else{
            num -= 1;
            step++;
            numberOfSteps(num);
        }
        return step; 
    }
}