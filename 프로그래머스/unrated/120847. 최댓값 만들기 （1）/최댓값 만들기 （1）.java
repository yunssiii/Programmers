class Solution {
    public int solution(int[] numbers) {
        
        //1. 오름차순 정렬하기
        //2. 큰 수 두 개를 곱하기
        
        int answer = 0;
        int temp = 0;
        
        for(int i=1;i<numbers.length;i++){
            for(int j=0;j<numbers.length-i;j++){
                if(numbers[j]>numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        return answer;
    }
}