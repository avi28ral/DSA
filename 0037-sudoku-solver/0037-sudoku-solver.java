class Solution {
    public boolean solveSudoku(char[][] board) {
        int row = -1;
        int col = -1;
        boolean emptyLeft = false;
        for(int i = 0 ; i < board.length; i++){
            for(int j =0; j < board.length; j++){
                if(board[i][j] == '.'){
                    emptyLeft = true;
                    row = i;
                    col = j;
                    break;
                }
            }
            if(emptyLeft){
                break;
            }
        }
        if(!emptyLeft){
            return true;
        }
        boolean isValid = false;
        for(int i = 1; i<= 9; i++){
            char num = (char)(i + '0');
            if(isSafe(board, row , col, num)){
                isValid = true;
                board[row][col] = num;
                if(solveSudoku(board)){
                    return true;
                }
                else{
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }
    static boolean isSafe(char[][] board, int row,int col, char num){
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == num){
                return false;
            }
        }
        for(int i = 0; i < board.length; i++){
            if(board[row][i]== num){
                return false;
            }
        }
        int rowStart = row - (row%3);
         
        int colStart = col - (col % 3);
       
        for(int r = rowStart; r < rowStart+3; r++){
            for(int c = colStart; c < colStart + 3; c++){
                if(board[r][c]== num){
                    return false;
                }
            }
        }
        return true;
    }
}