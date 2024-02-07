class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x12 = Math.abs(dots[0][0] - dots[1][0]);
        int x13 = Math.abs(dots[0][0] - dots[2][0]);
        int x14 = Math.abs(dots[0][0] - dots[3][0]);
        int x23 = Math.abs(dots[1][0] - dots[2][0]);
        int x24 = Math.abs(dots[1][0] - dots[3][0]);
        int x34 = Math.abs(dots[2][0] - dots[3][0]);
        int y12 = Math.abs(dots[0][1] - dots[1][1]);
        int y13 = Math.abs(dots[0][1] - dots[2][1]);
        int y14 = Math.abs(dots[0][1] - dots[3][1]);
        int y23 = Math.abs(dots[1][1] - dots[2][1]);
        int y24 = Math.abs(dots[1][1] - dots[3][1]);
        int y34 = Math.abs(dots[2][1] - dots[3][1]);
        
        if((double)y12/x12 == (double)y34/x34){
            answer = 1;
        }else if((double)y13/x13 == (double)y24/x24){
            answer = 1;
        }else if((double)y14/x14 == (double)y23/x23){
            answer = 1;
        }
        
        return answer;
    }
}