class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> hs.get(a) - hs.get(b));
        for (Integer x : hs.keySet()) {
        minHeap.add(x);

        if (minHeap.size() > k) {
            minHeap.poll();
        }
        }
        int[] arr = new int[k];
        for(int i =0;i<k;i++){
            arr[i] = minHeap.poll();
        }
        return arr;
    }
}