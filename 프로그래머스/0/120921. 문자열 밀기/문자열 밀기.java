class Solution {
    public int solution(String A, String B) {
        int answer = -1;

        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) {
                answer = i;
                break;
            }
            
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1); // A를 한 칸씩 오른쪽으로 이동
        }

        return answer;
    }
}