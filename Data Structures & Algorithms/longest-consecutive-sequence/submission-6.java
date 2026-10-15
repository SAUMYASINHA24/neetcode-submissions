class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length ==0)
            return 0;
        int longest = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums)
            set.add(x);
        for(int currentValue: set)
        {
            int counter = 1;
            //System.out.println("currentValue is : "+currentValue);
            if(!set.contains(currentValue -1))
            {
                while(set.contains(currentValue+1))
                {
                    counter++;
                    currentValue++;
                }
                longest = Math.max(longest,counter);
               // System.out.println("currentValue is : " + currentValue + "longest is : "+longest);
            }
        }
        return longest;
        
    }
}
