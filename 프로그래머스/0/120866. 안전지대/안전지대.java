import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        Set<String> dangerSet = new HashSet<>();
        
        // 지뢰가 있는 위치와 주변의 위험지역 찾기
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    // 지뢰가 있는 위치
                    dangerSet.add(i + "," + j);
                    // 주변의 위험지역 찾기
                    for (int x = i - 1; x <= i + 1; x++) {
                        for (int y = j - 1; y <= j + 1; y++) {
                            if (x >= 0 && x < board.length && y >= 0 && y < board.length) {
                                dangerSet.add(x + "," + y);
                            }
                        }
                    }
                }
            }
        }
        
        // 안전한 지역의 개수 구하기
        answer = (board.length * board.length) - dangerSet.size();

        return answer;
    }
}