class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        long mul = 1; 
        
        for(int i=1;i<=count;i++){
            mul = price*i;
            total += mul;
        }
        
        if(money > total){
            answer = 0;
        }else {
            answer = total - money;
        }

        return answer;
    }
}