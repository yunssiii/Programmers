class Solution {
    public int solution(int n) {
        
        int answer = 1; //피자판의 변수
        
        while(true){
            if((6*answer)%n==0){
                break;
            }
            answer++;
        }
        
        return answer;
    }
}