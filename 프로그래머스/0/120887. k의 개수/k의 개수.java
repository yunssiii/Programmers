class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int a = i; a <= j; a++) {
            int num = a;
            while (num > 0) {
                int digit = num % 10;
                if (digit == k) {
                    answer++;
                }
                num /= 10;
            }
        }
        
        return answer;
    }
}
