class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hs = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            String a = strs[i];
            char[] arr = a.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!hs.containsKey(key)){
                hs.put(key, new ArrayList<>());
            }
            hs.get(key).add(strs[i]);
        }
        return new ArrayList<>(hs.values());
    }
}