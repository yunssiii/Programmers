class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] array = new int[200]; //원소의 길이만큼 배열 생성(-100~100)
        
        for(int i=0;i<lines.length;i++){ //배열에 겹치는 길이 표시
            for(int j=lines[i][0] + 100; j<lines[i][1] + 100; j++){
                array[j]++;
            }
        }
        
        for(int k=0;k<200;k++){ //배열에 겹쳐진 길이가 얼마있는지 구하기 
            if(array[k]>1){
                answer++;
            }
        }
        
        return answer;
    }
}