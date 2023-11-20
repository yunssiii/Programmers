class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i=0;i<num_list.length;i++){
            int a = num_list.length - i;
            answer[i] = num_list[a-1]; 
        }
        
        return answer;
    }
}