class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        while(max%min!=0){
            int temp = max % min;
            max = min;
            min = temp;
        }
        
        answer[0] = min;
        answer[1] = (n*m)/answer[0];

        return answer;
    }
}