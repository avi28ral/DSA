class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
           char bracket = s.charAt(i);
           if(bracket == '(' || bracket == '[' || bracket == '{'){
                stack.push(bracket);
           }else{
                if(bracket == ')'){
                    if(stack.isEmpty() ||stack.pop() != '('){
                        return false;
                    }
                }
                if(bracket == ']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                }
                if(bracket == '}'){
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                }
           }

        }
        return stack.isEmpty();
    }
}