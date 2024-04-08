class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0; //가로
        int min = 0; //세로 
        
        for(int[] card : sizes){
            //(두 변의 길이 중 큰 것)과 기존 max 값 중 큰 것 = 가장 큰 가로 길이 (가로>세로)
            max = Math.max(max, Math.max(card[0],card[1]));
            //(두 변의 길이 중 작은 것)과 기존 min 중 큰 것 = 가장 큰 세로 길이 (가로>세로)
            min = Math.max(min, Math.min(card[0],card[1]));
        }
        
        answer = max*min;
        return answer;
    }
}