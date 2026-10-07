class Solution {
    public String removeDuplicates(String s) {
       Stack <Character> stack = new Stack <>();
       for (char ch : s.toCharArray()){
        if(!stack.isEmpty() && stack.peek() == ch){
            stack.pop();
        }
        else {
            stack.push(ch);
        }
       }
       char[] ans = new char[stack.size()];
       int i=0;
       for ( char ch : stack){
        ans[i++] = ch;
       }

        return new String(ans);
     }  
    }
