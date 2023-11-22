class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int nPrice = 12000 * n;
        int kPrice = 0;
        
        //양꼬치를 나눴을 때 몫이 1이상이면 -n/10
        //아니면 그냥
        
        if((n/10) > 0){
            kPrice = (k-(n/10))*2000;
        }else {
            kPrice = k*2000;
        }
        
        answer = nPrice + kPrice;
        
        return answer;
    }
}