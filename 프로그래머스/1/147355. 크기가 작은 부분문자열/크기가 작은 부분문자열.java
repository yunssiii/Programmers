class Solution {
    public int solution(String t, String p) {
        
        int answer = 0;
        int leng = t.length() - p.length();
        long numP = Long.parseLong(p);
        long numStr = 0;
        String str;
        
        for(int i=0;i<=leng;i++){
            str = t.substring(i, i + p.length()); 
            numStr = Long.parseLong(str);
            
            if(numStr<=numP){
                answer++;
            }
        }
        return answer;
    }
}