import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) { //1. 소인수분해 개수 구하기
            while (n % i == 0) {
                if (!list.contains(i)) { //중복되지 않은 i만 저장
                    list.add(i);
                }
                n /= i;
            }
        }

        int[] answer = new int[list.size()]; //2. 소인수분해의 수만큼 선언하기
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);

        return answer;
    }
}