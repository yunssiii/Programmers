class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        if(total%num==0){
            for(int i=0;i<num;i++){
                answer[i] = (total/num) - (num/2) + i;
            }
        }else {
            for(int j=0;j<num;j++){
                answer[j] = (total/num) - (num/2) + j + 1;
            }
        }
        
        return answer;
    }
}