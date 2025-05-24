class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lis = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            String temp = String.valueOf(x);
            if(words[i].contains(temp)) lis.add(i);
        }
        return lis;
    }
}