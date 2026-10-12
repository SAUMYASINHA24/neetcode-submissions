class Solution {
    public int[] productExceptSelf(int[] nums) {

        int totalMultipleValue = 1;
        int count = 0;

        for(int x : nums)
        {
            if(x == 0)
            {
                count++;   
            }
            else
                totalMultipleValue = totalMultipleValue*x;
        }
            

        for(int i =0;i<nums.length;i++)
        {
            if(count==0)
                nums[i] = totalMultipleValue/nums[i];
            else if(count == 1)
            {
                if(nums[i] == 0)
                    nums[i] = totalMultipleValue;
                else
                    nums[i] = 0;
            }
            else
            {
                nums[i] = 0;
            }
        }

        return nums;
        
    }
}  
