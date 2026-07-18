class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length;i++){
            int req = target - nums[i];
            if(hs.containsKey(req)){
                return new int[] {hs.get(req),i};
            }else{
                hs.put(nums[i],i);
            }
        }
        return new int[0];
    }
}