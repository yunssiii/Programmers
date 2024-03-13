import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        //StringBuilder 사용하기 - reverse()와 toString()
        
        char[] ch = s.toCharArray();
        
        Arrays.sort(ch);
        
        answer = new StringBuilder(new String(ch)).reverse().toString();
        
        return answer;
    }
}