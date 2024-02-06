import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int hap = sides[0] + sides[1];
        int count = 0;
        
        Arrays.sort(sides); //오름정렬
        
        for(int i=1;i<hap;i++){
            if(i >= sides[1] && i < sides[0] + sides[1] ){ //i가 가장 긴 변
                count++;
            }else if(sides[1] < sides[0] + i){ //매개변수 중 가장 긴 변이 있으면 
                count++;
            } 
        }
        
        answer = count;
        
        return answer;
    }
}