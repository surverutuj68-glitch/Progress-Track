class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int sum = nums[left];
        while(right<nums.length){
            if(sum >= target){
                min = Math.min(min, right-left+1);
                sum-= nums[left];
                left++;
            }else{
                right++;
                if(right<nums.length){
                    sum+=nums[right];
                }
            }
        }
        if(min == Integer.MAX_VALUE){
            min = 0;
        }
        return min;
    }
}