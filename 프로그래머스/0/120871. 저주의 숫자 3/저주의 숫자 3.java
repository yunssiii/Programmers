class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        int count = 0;
        
        while(count < n){
            
            String str = Integer.toString(i); 
            
            if(!str.contains("3") && i%3 != 0){
                answer = i;
                count++;
            }
            i++;
        }
        
        return answer;
    }
}