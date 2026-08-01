class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        dfs(s,0,new ArrayList<String>());
        return ans;
    }
    private boolean isPalindrome(String subString){
        int left = 0;
        int right = subString.length() - 1;
        while(left < right){
            if(subString.charAt(left) != subString.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    private void dfs(String s, int start, List<String> path){
        if(start == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int end = start; end<s.length();end++){
            String subString = s.substring(start,end+1);
            if(isPalindrome(subString)){
                path.add(subString);
                dfs(s,end+1,path);
            }else{
                continue;
            }
            path.remove(path.size()-1); 
        }
    }
}