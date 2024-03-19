import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        // 첫 번째 숫자는 무조건 유지하고 시작
        list.add(arr[0]);
        
        // 배열을 순회하면서 연속된 숫자 제거
        for (int i = 1; i < arr.length; i++) {
            // 현재 숫자와 이전 숫자가 다르면 리스트에 추가
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        
        // 리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
