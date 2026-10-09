class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> twoSumHM = new HashMap<>();
        for(int i = 0;i<nums.length; i++)
        {
            if(twoSumHM.containsKey(nums[i]))
                return new int[]{twoSumHM.get(nums[i]), i};
                
            else
                twoSumHM.put(target - nums[i],i);
        }
        
        return new int[]{0,0};
    }
}
