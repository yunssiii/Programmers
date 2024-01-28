class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0;i<my_string.length();i++){
            
            char c = my_string.charAt(i);
            
            if(c>='A' && c<='Z'){
                c = Character.toLowerCase(c);
            }else if(c>='a' && c<='z'){
                c = Character.toUpperCase(c);
            }
            
            answer += Character.toString(c);
            
        }
        
        return answer;
    }
}