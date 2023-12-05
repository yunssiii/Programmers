class Solution {
    public int[] solution(int[] numbers, String direction) {
                
        //마지막값은 따로 구해서 넣고
        //나머지들은 +1 / -1 해서 넣기
        
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")){
            for(int i=0;i<numbers.length-1;i++){
                answer[i+1] = numbers[i];
            }
            answer[0] = numbers[numbers.length-1];
        }else {
            for(int j=1;j<numbers.length;j++){
                answer[j-1] = numbers[j];
            }
            answer[numbers.length-1] = numbers[0];
        }
        
        return answer;
    }
}