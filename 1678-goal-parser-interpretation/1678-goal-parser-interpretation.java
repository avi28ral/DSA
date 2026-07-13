class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i =0;
        while(i < command.length()){
            if(command.charAt(i) == 'G'){
                sb.append("G");
                i++;
            }else if(command.charAt(i) == '('){
                i++;
            }else if(command.charAt(i) ==')'){
                sb.append("o");
                i++;
            }else{
                sb.append("al");
                i += 3;
            }
        }
        return sb.toString();

    }
}