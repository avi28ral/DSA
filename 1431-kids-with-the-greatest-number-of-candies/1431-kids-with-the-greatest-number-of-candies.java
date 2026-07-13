class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        ArrayList<Boolean> result = new ArrayList<>();
        for(int i=0; i<candies.length; i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int j=0; j<candies.length; j++){
            result.add(candies[j]+extraCandies >= max);
        }
        return result;
    }
}