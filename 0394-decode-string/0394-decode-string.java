class Solution {
    public String decodeString(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<StringBuilder> strb = new Stack<>();
        StringBuilder str = new StringBuilder();
        int val = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= '0' && c <= '9')
                val = val*10 + c - '0';
            else if(c == '['){
                strb.push(str);
                str = new StringBuilder();
                num.push(val);
                val = 0;
            }
            else if(c == ']'){
                StringBuilder temp = str;
                str = strb.pop();
                int cou = num.pop();
                while(cou-- > 0)
                    str.append(temp);
            }
            else
                str.append(c);
        }
        return str.toString();
    }
}