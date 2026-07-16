class Solution {
    
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        
        return queens(board, 0);
       
        

        
    }
    private static List<List<String>> queens(boolean[][] board, int row){
        if(row == board.length){
            List<List<String>> ans = new ArrayList<>();
            List<String> internal = new ArrayList<>();
            for(boolean[] r: board){
                String pos = "";
                for(boolean element : r) {
                    if (element) {
                        pos += 'Q';
                    }   else {
                        pos += '.';
                    }
            
                }
                internal.add(pos);

            }
            ans.add(internal);
            return ans;
        }
        List<List<String>> ans = new ArrayList<>();
        for(int col = 0; col < board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                ans.addAll(queens(board,row+1));
                board[row][col] = false;  
            }
        }
        return ans;
        
    }
    private static boolean isSafe(boolean[][] board, int row, int col){
        for(int i = 0; i < row; i++){
            if(board[i][col]){
                return false;
            }
        }
        int maxLeft = Math.min(row,col);
        for(int i = 1; i <= maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxRight = Math.min(row, board.length-col-1);
        for(int i =1; i <= maxRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}