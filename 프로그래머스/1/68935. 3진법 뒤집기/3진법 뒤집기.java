class Solution {
    public int solution(int n) {
        int answer = 0;
        int su = 0;
        String str = "";
        
        while(n/3 >= 1){
            su = n%3;
            str += String.valueOf(su);
            n = n/3;
        }
        
        str = str + String.valueOf(n);
        
        answer = Integer.parseInt(str,3);
        
        return answer;
    }
}