import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        
        char[] charArray = s.toCharArray();
        
        Arrays.sort(charArray);
        
        for(int i=0;i<charArray.length;i++){
            for(int j=0;j<charArray.length;j++){
                if(charArray[i]==charArray[j]){
                    count++;
                }
            }
            
            if(count == 1){
                answer += charArray[i];
            } 
            count = 0;
        }
        
        return answer;
    }
}