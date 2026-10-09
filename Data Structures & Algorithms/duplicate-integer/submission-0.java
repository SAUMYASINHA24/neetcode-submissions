class Solution {
    public boolean hasDuplicate(int[] nums) {
        
       int i=0; int j = i+1;
       while(i<nums.length-1)
       {
            if(j == nums.length)
            {
               i++;
               j = i+1; 
            }
            if(j<nums.length && nums[i] == nums[j])
                return true;

            j++;
       }
       return false;
    }
}