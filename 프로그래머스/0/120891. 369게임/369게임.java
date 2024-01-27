import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String sOrder = Integer.toString(order);
        
        for(int i=0;i<sOrder.length();i++){
            
            char cOrder = sOrder.charAt(i);
            
            if(cOrder %3 ==0 && cOrder != '0'){
                answer++;
            }
        }
        
        return answer;
    }
}