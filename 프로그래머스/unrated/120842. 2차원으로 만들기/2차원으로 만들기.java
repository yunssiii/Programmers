class Solution {
    public int[][] solution(int[] num_list, int n) {
        
        //num_list의 값을 꺼내 새로운 1차원 배열에 넣고
        //새로운 1차원 배열을 그대로 answer배열에 넣기
        //즉, 1차월 배열을 만들고 2차원배열에 저장
        
        int[][] answer = new int [num_list.length/n][n];
        int k = 0;
        
        for(int i=0;i<answer.length;i++){
            int[] temp = new int [n];
            for(int j=0;j<n;j++){
                temp[j] = num_list[k];
                k++;
            }
            answer[i] = temp;
        }

        return answer;
    }
}