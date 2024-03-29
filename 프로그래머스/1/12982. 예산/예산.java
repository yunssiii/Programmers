import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        // 지원 가능한 경우의 수를 구해야 해?
        // 최대니까 예산이 적은 것들을 더해야 해..
        
        int answer = 0;
        int hap = 0;
 
        Arrays.sort(d); // 오름정렬해서 최솟값을 앞에 배치
        
        for(int i=0;i<d.length;i++){
            hap += d[i];
            if(hap > budget){
                answer = i;
                return answer;
            }else if(hap == budget){
                answer = i+1;
            }else if(hap < budget){
                answer = i+1;
            }
        }
    
        return answer;
    }
}