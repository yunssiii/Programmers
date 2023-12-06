import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        my_string = my_string.replaceAll("[^0-9]","");
        
        int[] answer = new int[my_string.length()];
        char[] target = my_string.toCharArray(); // 문자열을 문자 배열로 변환
        
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = Character.getNumericValue(target[i]); // 문자를 정수로 변환하여 배열에 저장
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}