class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int h = 0; //가로
        int v = 0; //세로 

        for(int i=0;i<dots.length - 1;i++){
            if(dots[i][0] != dots[i+1][0]){
                h = Math.abs(dots[i][0] - dots[i+1][0]);
            }
            
            if(dots[i][1] != dots[i+1][1]){
                v = Math.abs(dots[i][1] - dots[i+1][1]);
            }
        }
        
        answer = h*v;
        
        return answer;
    }
}