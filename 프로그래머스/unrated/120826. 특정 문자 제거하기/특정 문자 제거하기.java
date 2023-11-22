class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        //1. char화하고 누적해서 answer에 더하는데
        //2. if letter와 같으면 빼고 더하기?
        
        for(int i=0;i<my_string.length();i++){
            if(my_string.charAt(i)!=letter.charAt(0)){
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}