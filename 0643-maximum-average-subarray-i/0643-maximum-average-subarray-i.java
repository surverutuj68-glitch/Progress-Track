class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0;
        double windowSum = 0;
        for(int i = 0; i<k;i++){
            windowSum += nums[i];
        }
        maxAvg = windowSum/k;
        int i = 0;
        int j = k;
        while(j<nums.length){
            windowSum = windowSum + nums[j] - nums[i];
            maxAvg = Math.max(maxAvg, (windowSum/k));
            i++;
            j++;
        }
        return maxAvg;
    }
}