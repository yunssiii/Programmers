class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        //최대공약수를 구하기 위한 최대/최수값 구하기 
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int gcd = 0;
        
        //유클리드 호제법으로 최대공약수 구하기 
        while(min != 0){
            int remainder = max % min;
            max = min;
            min = remainder;
        }
        
        gcd = max;
        
        //기약분수값 구하기 
        a = a/gcd;
        b = b/gcd;
        
          // 분모가 2와 5로만 구성되었는지 확인
        while (b % 2 == 0) {
            b /= 2;
        }
        while (b % 5 == 0) {
            b /= 5;
        }
        
        // 분모가 1이 되었다면 유한소수
        if(b == 1){
            answer = 1;
        }
        
        
        
        
        return answer;
    }
}