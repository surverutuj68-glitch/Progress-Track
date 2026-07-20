class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        int leftSum = 0;
        for(int i = 0;i<nums.length;i++){
            total += nums[i];
        }
        int j = 0;
        while(j<nums.length){
            int rightSum = total - leftSum - nums[j];
            if(leftSum == rightSum){
                return j;
            }
                leftSum+= nums[j];
                j++;
        }
        return -1;
    }
}