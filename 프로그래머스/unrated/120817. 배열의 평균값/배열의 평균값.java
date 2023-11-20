class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int x = 0;
        
        for(int i=0;i<numbers.length;i++){
            x += numbers[i];
            //x = x+numbers[i];
        }
        
        answer = (double)x/numbers.length;
        
        return answer;
    }
}