class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> modifiedSet = new HashSet<>();
        for(int x : nums)
        {
            if(!modifiedSet.add(x))
                return true;
        }

        return false;
        
    }
}