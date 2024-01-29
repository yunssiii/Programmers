import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        Map<Character, Integer> hashmap = new HashMap<>();
        
        for(char c : s.toCharArray()){
            hashmap.put(c,hashmap.getOrDefault(c,0) + 1);
        }
        
        for(char key : hashmap.keySet()){
            
            if(hashmap.get(key) == 1){
                sb.append(key);
            }
        }
        
        String result = sb.toString();
        char[] charArray = result.toCharArray();
        Arrays.sort(charArray);
        answer = String.valueOf(charArray);
        
        return answer;
    }
}