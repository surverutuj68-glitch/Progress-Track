class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        int length = 0;
        int i = 0;
        int j = 0;
        while(j<s.length()){
            char a = s.charAt(j);
            if(!hs.contains(a)){
                hs.add(a);
                length = Math.max(length, (j-i+1));
                j++;
            }else{
                hs.remove(s.charAt(i));
                i++;
            }
        }
        return length;
    }
}