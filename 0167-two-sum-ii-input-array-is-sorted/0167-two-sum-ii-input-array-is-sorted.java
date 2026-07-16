class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int i = 0;
        int j = numbers.length-1;
        while(numbers[i]+numbers[j]!= target){
            if(numbers[i]+numbers[j]<target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{i+1, j+1};
    }
}