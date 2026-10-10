class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> maps = new HashMap<>();
        for(int x : nums)
        {
            maps.put(x, maps.getOrDefault(x,0) +1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length+1];

        for(int x : maps.keySet())
        {
            int frequency = maps.get(x);
            if(buckets[frequency] == null)
            {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(x);

        }
        int index = 0;
        int result[] = new int[k]; 
        for(int i = buckets.length -1;i>=0 && index<k;i--)
        {
            if(buckets[i] != null)
            {
                for(int num : buckets[i])
                {
                    result[index++] = num;
                }

                if(index == k)
                    break;
            }
        }


        return result;

        
    }
}
