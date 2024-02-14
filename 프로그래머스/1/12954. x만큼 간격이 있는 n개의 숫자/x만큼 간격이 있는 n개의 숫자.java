class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int k = 0;

        for (long i = x; k < n; i += x) {
            answer[k] = i;
            k++;
        }
        
        return answer;
    }
}
