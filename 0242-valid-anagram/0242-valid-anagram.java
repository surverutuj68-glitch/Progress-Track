class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i = 0; i<s.length();i++){
            char a = s.charAt(i);
            hs.put(a,hs.getOrDefault(a,0)+1);
        }
        for(int j=0; j<t.length();j++){
            char b = t.charAt(j);
            if(hs.containsKey(b)){
                hs.put(b,hs.get(b)-1);
            }else{
                return false;
            }
            if(hs.get(b)==0){
                hs.remove(b);
            }
        }
        return hs.isEmpty();
    }
}