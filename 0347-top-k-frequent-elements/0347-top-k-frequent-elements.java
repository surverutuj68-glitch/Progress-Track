class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        for(int i =0;i<nums.length;i++){
                hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> li = new ArrayList<>(hs.entrySet());
        Collections.sort(li,(a,b)-> b.getValue()-a.getValue());
        int[] arr = new int[k];
        for(int j =0;j<k;j++){
            arr[j] = li.get(j).getKey();
        }
        return arr;
    }
}