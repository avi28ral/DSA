class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int moves = 0;
        for(int i =0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(ch);
                moves++;
            }else if(ch == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    stack.push(ch);
                    moves++;
                }else{
                    stack.pop();
                    moves--;
                }
            }
        }
        return moves;
    }
}