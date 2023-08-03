class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.isEmpty()) return ans;
        String[] map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve("", digits, map, ans);
        return ans;
    }
    static void solve(String cur, String dig, String[] map, List<String> ans){
        if(dig.isEmpty()) ans.add(cur);
        else{
            String letters = map[dig.charAt(0) - '2'];
            for(char x : letters.toCharArray())
                solve(cur + x, dig.substring(1), map, ans);
        }
    }
}