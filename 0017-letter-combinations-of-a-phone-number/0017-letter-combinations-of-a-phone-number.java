class Solution {
    public List<String> letterCombinations(String digits) {
        
        return helper("",digits);
        
    }
    static List<String> helper(String p, String up){
        if(up.isEmpty()){
            List<String> List = new ArrayList<>();
            List.add(p);
            return List;
        }
        int digit = up.charAt(0) - '0';
        int i = (digit - 2)*3;
        if(digit > 7){
            i = (digit - 2)*3 + 1;
        }
        int len = i + 3;
        if(digit == 7 || digit == 9){
            len = i + 4;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(; i<len;i++){
            char ch = (char)('a'+i);
            ans.addAll(helper(p+ch,up.substring(1)));
        }
        return ans;
    }
}