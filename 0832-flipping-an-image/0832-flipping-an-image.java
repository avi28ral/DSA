class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row: image){
            for(int i=0; i < (row.length+1)/2; i++){
                int temp = row[i];
                row[i] = row[row.length-1-i]^1;
                row[row.length-i-1] = temp^1;
            }
        }
        return image;
    }
}