class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        dfs(nums, new ArrayList<>(), new boolean[nums.length]);
        return ans;
    }
    private void dfs(int[] nums, List<Integer> path, boolean[] used){
        if(path.size()==nums.length){
                ans.add(new ArrayList<>(path));
                return;
            }
        for(int i = 0;i<nums.length;i++){
            if(i>0 && nums[i-1]==nums[i]){
                if(!used[i-1]){
                    continue;
                }
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