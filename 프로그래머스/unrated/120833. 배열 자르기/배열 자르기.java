class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int num3 = num2-num1+1;
        
        int[] answer = new int[num3];
        
        for(int i =num1,j=0;i<=num2;i++){
            answer[j] = numbers[i];
            j++;
        }
        
        return answer;
    }
}