class Solution {
    public int solution(int slice, int n) {
        int answer = 0;

        if(n%slice==0){
            answer = n/slice;
            return answer;
        }else {
            answer = n/slice + 1;
        }
        
        //삼항연산자
        //answer = n%slice == 0?n/slice:n/slice+1;

        return answer;
    }
}