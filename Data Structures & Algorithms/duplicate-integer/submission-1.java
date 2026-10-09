class Solution {
    public boolean hasDuplicate(int[] nums) {
        
       HashSet<Integer> numsSet = new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
            numsSet.add(nums[i]);
       }

       if(numsSet.size() == nums.length)
        return false;
        else
        return true;
    }
}