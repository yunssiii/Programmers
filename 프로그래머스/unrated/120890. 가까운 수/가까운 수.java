import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        
        //11,14일 때 11을 리턴해야함
        
        int answer = 0;
        int m = 101;
        int k = 0;
        
        Arrays.sort(array);
        
        for(int i=0;i<array.length;i++){
            if(array[i]>n){
                k = array[i] - n;
            }else {
                k = n - array[i];
            }
            
            if (m>k) {
                m = k;
                answer = array[i];
            }            
        }
        
        return answer;
    }
}