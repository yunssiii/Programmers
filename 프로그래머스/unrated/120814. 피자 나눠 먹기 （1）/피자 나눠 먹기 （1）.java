class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n<8){
            answer = 1;
            return answer;
        }else {
            
            if(n%7 == 0){
                answer = n/7;
                return answer;
            }else {
                answer = n/7 + 1;
            }
        }
        
        return answer;
    }
}