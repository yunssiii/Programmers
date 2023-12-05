class Solution {
    public int solution(int n) {
        int answer = 0;
        int f = 1;
        
        for(int i=1;i<10;i++){
            f *= i;
            
            if(f == n){
                answer = i;
                return answer;
            }else if(f > n){
                answer = i-1;
                return answer;
            }           
        }
        return answer;
    }
}