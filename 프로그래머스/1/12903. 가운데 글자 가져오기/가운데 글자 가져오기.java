class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] chArray = s.toCharArray();
        
        if(s.length()%2==0){
            for(int i=1;i>=0;i--){
                answer += String.valueOf(chArray[s.length()/2 - i]);
            }
        }else {
            answer = String.valueOf(chArray[s.length()/2]);
        }
        
        return answer;
    }
}