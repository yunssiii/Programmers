class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];
        
        for(int i=0;i<score.length;i++){
            avg[i] = (double) (score[i][0] + score[i][1]) / 2;
        }
        
        for(int i=0;i<avg.length;i++){
            for(int j=0;j<avg.length;j++){
                if(i == j || avg[i] < avg[j]){
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}