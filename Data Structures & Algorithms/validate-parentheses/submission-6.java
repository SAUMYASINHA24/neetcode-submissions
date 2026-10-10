class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        for(int i =0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }
            else if(stack.isEmpty())
                return false;
            else if(ch == ')' && stack.peek() != '(')
            {
                flag = false;
                break;
            }    
            else if(ch == '}' && stack.peek() != '{')
            {
                flag = false;
                break;
            }
            else if(ch == ']' && stack.peek() != '[')
            {
                flag = false;
                break;
            }
            else
                stack.pop();
        }
        if(stack.size()!=0)
            return false;
        else
            return flag;
        
    }
}
