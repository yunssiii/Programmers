class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int [numbers.length];
        int index = 0;
        
        if(direction.equals("right")){
            for(int i=0;i<numbers.length;i++){
                if(index>numbers.length-2){
                    i = i-(numbers.length-1);
                    answer[i] = numbers[index];
                    return answer;
                }
                answer[i+1] = numbers[index];
                index++;
            }
        }else if(direction.equals("left")){
            for(int j=0;j<numbers.length;j++){
                if(index>numbers.length-2){
                    j = j-(numbers.length-1);
                    answer[index] = numbers[j];
                    return answer;
                }
                answer[index] = numbers[j+1];
                index++;
            }
        }
        
        return answer;
    }
}