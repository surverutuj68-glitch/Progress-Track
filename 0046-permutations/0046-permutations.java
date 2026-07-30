class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        dfs(nums, new ArrayList<Integer>(), new boolean[nums.length]);
        return ans;
    }
    private void dfs(int[] nums,List<Integer> path, boolean[] used){
        for(int i= 0;i<nums.length;i++){
            if(path.size()==nums.length){
            ans.add(new ArrayList<>(path));
            return;
            }
            if(used[i]){
                continue;
            }else{
            path.add(nums[i]);
            used[i] = true;
            dfs(nums,path,used);
            path.remove(path.size()-1);
            used[i] = false;
            }
            
        }
    }
}