class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        
        //세로
        int m = M-1;
        
        //가로
        int n = (N-1) * M;
        
        answer = m+n;
        
        return answer;
    }
}