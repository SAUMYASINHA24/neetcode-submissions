class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        HashMap<Character,Integer> maps = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(maps.containsKey(ch))
                maps.put(ch, maps.get(ch) +1);
            else
                maps.put(ch,1);
        }

        for(int i=0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            if(!maps.containsKey(ch) || (maps.get(ch) == 0))
                return false;
            maps.put(ch,maps.get(ch)-1);
        }

        return true;
        
    }
}
