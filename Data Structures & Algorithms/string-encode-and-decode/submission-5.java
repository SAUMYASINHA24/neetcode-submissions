class Solution {

    public String encode(List<String> strs) {

        String encodedString = "";
        for(String x : strs)
            encodedString = encodedString + x.length()+"#"+x+"#";
        System.out.println("string is:"+encodedString);
        return encodedString;

    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();
        int startIndex = 0;
        
        if(str.length()!=0)
        {
            while(startIndex<str.length())
            {
                int delimiterIndex = str.indexOf("#",startIndex);
                int length = Integer.parseInt(str.substring(startIndex,delimiterIndex));
                int wordStart = delimiterIndex+1;
                int wordEnd = wordStart + length;
                String temp = str.substring(wordStart,wordEnd);
                System.out.println(temp);
                result.add(temp);
                startIndex = wordEnd+1; 
            }
        }
        return result;

        
    }
}
