class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        String regex = "^[0-9]+$";
        
        if(s.length()==4 || s.length()==6){
            if(s.matches(regex)){
            answer = true;
            }else {
                answer = false;
            }
        }

        return answer;
    }
}