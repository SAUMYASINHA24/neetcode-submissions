class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> maps = new HashMap<>();
        for(int x : nums)
        {
            maps.put(x, maps.getOrDefault(x,0) +1);
        }     

        List<Integer> keys = new ArrayList<>(maps.keySet());
       
        keys.sort((a,b) -> maps.get(b) - maps.get(a));

        int result[] = new int[k]; 
        for(int i =0;i<k;i++)
        {
            result[i] = keys.get(i);
        }

        return result;
        
    }
}
