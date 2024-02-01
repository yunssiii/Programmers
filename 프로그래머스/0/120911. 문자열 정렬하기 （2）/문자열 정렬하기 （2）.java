import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        answer = my_string.toLowerCase();
        
        char[] ch = answer.toCharArray();
        
        Arrays.sort(ch); //배열만 가능
        
        answer = String.valueOf(ch);
        
        return answer;
    }
}