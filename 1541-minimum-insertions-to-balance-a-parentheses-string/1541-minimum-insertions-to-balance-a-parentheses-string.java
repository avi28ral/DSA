class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
               if(stack.isEmpty()){
                stack.push(ch);
               }else if(stack.peek() == '('){
                stack.push(ch);
               }else{
                insertions++;
                stack.pop();
                stack.pop();
                stack.push(ch);
            }
            }else{
                if(stack.isEmpty()){
                    insertions++;
                    stack.push('(');
                    stack.push(ch);
                }else{
                    if(stack.peek() == ')'){
                        stack.pop();
                        stack.pop();
                    }else{
                        stack.push(ch);
                    }
                }
               
            }
        }
        if(stack.isEmpty()){
            return insertions;
        }else{
            while(!stack.isEmpty()){
                char ch = stack.pop();
                if(ch == '('){
                    insertions += 2;
                }else{
                    insertions++;
                    stack.pop();
                }
            }
            return insertions;
        }

    }
}