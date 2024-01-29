import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
         // 원래 배열을 변경하지 않고 복사하여 정렬
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        
        for(int i=0;i<array.length;i++){
            if(array[i] == sortedArray[sortedArray.length-1]){
                answer[0] = sortedArray[sortedArray.length-1];
                answer[1] = i;
            }
        }
        
        return answer;
    }
}