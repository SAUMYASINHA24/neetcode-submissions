class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> outputMap = new HashMap<>();

        for(String x : strs)
        {
            char arr[] = x.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!outputMap.containsKey(key))
            {
                List<String> tempValue = new ArrayList<>();
                tempValue.add(x);
                outputMap.put(key,tempValue);
                
            }       
            else
                outputMap.get(key).add(x);
        }

        //System.out.println(outputMap);
        return new ArrayList<>(outputMap.values());
    }
}
