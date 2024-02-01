class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        int su = 1;
        
        for(int i=1;i<=t;i++){
            su *= 2;
        }
        
        answer = n*su;
        
        return answer;
    }
}