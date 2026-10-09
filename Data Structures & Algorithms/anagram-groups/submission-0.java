class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> maps = new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            char[] tempCharArray = strs[i].toCharArray();
            Arrays.sort(tempCharArray);
            String key = new String(tempCharArray);
            

            if(maps.containsKey(key))
            {     
                maps.get(key).add(strs[i]);
            }
            else
            {
                List<String> tempValue = new ArrayList<>();
                tempValue.add(strs[i]);
                maps.put(key,tempValue);
            }
        }

        return new ArrayList<>(maps.values());
        
    }
}
