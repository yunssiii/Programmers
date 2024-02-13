class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int cal = (total/num) - (num/2);
        
        for(int i=0;i<num;i++){
            answer[i] = total%num > 0 ? cal+i+1 : cal+i;
        }
        
        return answer;
    }
}