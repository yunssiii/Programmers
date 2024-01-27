import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String sOrder = Integer.toString(order);
        
        List<Character> orderList = new ArrayList<>();
        
        for(int i=0;i<sOrder.length();i++){
            
            char cOrder = sOrder.charAt(i);
            orderList.add(cOrder);
            
        }
        
        for(int j=0;j<orderList.size();j++){
            if(orderList.get(j)=='3' || orderList.get(j)=='6' || orderList.get(j)=='9'){
                answer++;
            }
        }
        
        return answer;
    }
}