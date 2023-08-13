class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> hm = new HashMap<>();
        boolean vis[] = new boolean[secret.length()];
        int a = 0;
        int b = 0;
        for(int i = 0; i < secret.length(); i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if(s == g){
                a++;
                vis[i] = true;
            }
            else
                hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        for(int i = 0; i < guess.length(); i++){
            char g = guess.charAt(i);
            //System.out.println(hm.get(g));
            if(hm.get(g) == null || vis[i]) continue;
            if(hm.get(g) > 0){
                b++;
                hm.put(g, hm.get(g) - 1);
            }
        }
        return a + "A" + b + "B";
    }
}