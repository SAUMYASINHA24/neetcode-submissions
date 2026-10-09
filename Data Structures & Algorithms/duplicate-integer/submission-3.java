class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> modifiedSet = new HashSet<>();
        for(int x : nums)
        {
            modifiedSet.add(x);
        }

        if(modifiedSet.size()!= nums.length)
            return true;
        else
            return false;
        
    }
}