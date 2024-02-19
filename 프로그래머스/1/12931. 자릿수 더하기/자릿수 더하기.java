import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String nStr = String.valueOf(n);

        for(char ch : nStr.toCharArray()){
            answer += (ch -'0');
        }

        return answer;
    }
}