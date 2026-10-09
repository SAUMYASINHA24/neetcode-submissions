class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> firstString = new HashMap<>();
        HashMap<Character, Integer> secondString = new HashMap<>();

        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!firstString.containsKey(c))
            {
                firstString.put(c,1);
            }
            else
            {
                firstString.put(c, firstString.get(c) + 1);
            }
        }
        for(int i =0;i<t.length();i++)
        {
            char c = t.charAt(i);
            if(!secondString.containsKey(c))
            {
                secondString.put(c,1);
            }
            else
            {
                secondString.put(c, secondString.get(c) + 1);
            }
        }

        if(firstString.equals(secondString))
            return true;
        else
            return false;

        
    }
}
