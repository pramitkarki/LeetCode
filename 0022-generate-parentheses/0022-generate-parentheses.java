class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(n, ans, "");
        return ans;
    }
    static void solve(int n, List<String> ans, String str){
        if(str.length() == 2 * n){
            if(isValid(str)) ans.add(str);
            return;
        }
        solve(n, ans, str + "(");
        solve(n, ans, str + ")");
    }

    static boolean isValid(String str){
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '(' | c == '{' | c == '[') stk.push(c);
            else{
                if(stk.empty()) return false;
                else if(c == ')' && stk.peek() == '(') stk.pop();
                else if(c == '}' && stk.peek() == '{') stk.pop();
                else if(c == ']' && stk.peek() == '[') stk.pop();
                else return false;
            }
        }
        return stk.empty();
    }
}