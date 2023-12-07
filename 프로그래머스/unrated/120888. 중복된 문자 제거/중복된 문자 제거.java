import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        List<String> list = new ArrayList<>();
        
        for(int i=0;i<my_string.length();i++){
            
            //char currentChar = my_string.charAt(i);
            //String currentStr = String.valueOf(currentChar);
            
            if(!list.contains(String.valueOf(my_string.charAt(i)))){
                list.add(String.valueOf(my_string.charAt(i)));
            }
        }
        
        for(String s : list){
            answer += s;
        }
        
        return answer;
    }
}