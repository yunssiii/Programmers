class Solution {
    public int solution(int n) {
        int answer = 2;
        
        for(long i=1;i<=1000000;i++){
            if(i*i==n){
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}