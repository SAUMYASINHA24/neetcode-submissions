class Solution {
    public boolean isPalindrome(String s) {

        String temp = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        System.out.println("temp is : "+temp);
        for(int i = 0,j = temp.length()-1;i <= j;i++,j--)
        {
            Character char1 = Character.valueOf(temp.charAt(i));
            Character char2 = Character.valueOf(temp.charAt(j));
            if(!char1.equals(char2))
            {
                System.out.println("char is : "+temp.charAt(i));
                return false;
            }
        }
        return true;
        
    }
}
