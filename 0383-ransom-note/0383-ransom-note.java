class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for(int i=0;i<magazine.length();i++){
            freq[magazine.charAt(i) - 'a']++;
        }
        for(int j=0;j<ransomNote.length();j++){
            freq[ransomNote.charAt(j) - 'a']--;
        }
        for(int x : freq){
            if(x<0){
                return false;
            }
        }
        return true;
    }
}