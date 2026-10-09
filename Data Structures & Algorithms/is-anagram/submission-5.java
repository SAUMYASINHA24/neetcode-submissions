class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> firstString = new HashMap<>();

        if(s.length()!= t.length())
            return false;
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);
            
            firstString.put(c,firstString.getOrDefault(c,0) + 1);
        }
        for(int i =0;i<t.length();i++)
        {
            char c = t.charAt(i);
            if(!firstString.containsKey(c) || firstString.get(c) == 0)
            {
                return false;
            }
            else
            {
                firstString.put(c, firstString.get(c) - 1);
            }
        }
        return true;
    }
}
