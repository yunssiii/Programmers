class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffee = 1;
        int change = 0;
        
        if(money<5500){
            answer[0] = 0;
            answer[1] = money;
            return answer;
        }else {
            coffee = money/5500;
            change = money-(5500*coffee);
            
            answer[0] = coffee;
            answer[1] = change;
        }
        
        return answer;
    }
}