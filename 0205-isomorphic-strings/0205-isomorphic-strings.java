class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hs = new HashMap<Character,Character>();
        HashMap<Character,Character> hm = new HashMap<Character,Character>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i = 0; i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(hs.containsKey(a)&&hs.get(a)!=b){
                return false;
            }
            if(hm.containsKey(b)&&hm.get(b)!=a){
                return false;
            }
            hs.put(a,b);
            hm.put(b,a);
        }
        return true;
    }
}