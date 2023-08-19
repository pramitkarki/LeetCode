class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();
        HashSet<Character> chr = new HashSet<>();
        HashSet<String> str = new HashSet<>();

        String arr[] = s.split("\\s+");
        if(pattern.length() != arr.length) return false;

        for(int i = 0; i < arr.length; i++){
            char c = pattern.charAt(i);
            chr.add(c);
            str.add(arr[i]);
            if(hm.containsKey(c)){
                if(!hm.get(c).equals(arr[i])) return false;
            }
            else hm.put(c, arr[i]);
        }
        return chr.size() == str.size();
    }
}