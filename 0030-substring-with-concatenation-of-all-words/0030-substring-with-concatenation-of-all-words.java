class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if(s.length()==0 || s==null || words==null || words.length==0)
            return new ArrayList<>();
        
        Map<String, Integer> counts=new HashMap<>();
        for(String word:words)
            counts.put(word, counts.getOrDefault(word,0)+1);
        
        List<Integer> res=new ArrayList<>();
        int sLen=words[0].length(), len=words.length, n=s.length();
        
        for(int i=0;i<n-sLen*len+1;i++){
            String substr=s.substring(i, i+sLen*len);
            HashMap<String, Integer> seen=new HashMap<>();
            for(int j=0;j<substr.length(); j+=sLen){
                String word=substr.substring(j, j+sLen);
                seen.put(word, seen.getOrDefault(word,0)+1);
            }
            if(seen.equals(counts))
                res.add(i);
        }
        
        return res;
    }
}