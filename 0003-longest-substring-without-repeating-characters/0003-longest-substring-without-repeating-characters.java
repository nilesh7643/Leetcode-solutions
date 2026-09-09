class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int Length =0;
        for (int right =0; right <s.length();  right++){
      for (int i =left; i<right; i++){
        if (s.charAt(i) == s.charAt(right)){
        left = i+1;
        break;
        }
      }
        Length = Math.max(Length, right - left +1);
      }
        
      return Length;
        }
    }
