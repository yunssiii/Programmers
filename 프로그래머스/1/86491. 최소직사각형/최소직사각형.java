class Solution {
    public int solution(int[][] sizes) {
        
        int answer = 0;
        
        //1. [i][0] < [i][1] 일 때, 순서 바꾸기
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        //2. [i][0]끼리, [i][1]끼리 크기 비교 후 제일 큰 수 찾기
        int max1 = sizes[0][0];
        int max2 = sizes[0][1];
        
        for(int i=1;i<sizes.length;i++){
            if(sizes[i][0]>=max1){
                max1 = sizes[i][0];
            }
            if(sizes[i][1]>=max2){
                max2 = sizes[i][1];
            }
        }

        //3. [i][0]의 가장 큰 수 * [i][1]의 가장 큰 수
        answer = max1*max2;
        return answer;
    }
}