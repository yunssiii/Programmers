import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();
        
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);
        
        if(Arrays.equals(beforeArray, afterArray)){
            answer = 1;
        }
        
        return answer;
    }
}
