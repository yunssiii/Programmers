class Solution {
    public int solution(int chicken) {
        int answer = -1;
        int service = 0;
        int newService = 0;
        int restCoupon = 0;
        
        
        if(chicken >= 10){
            restCoupon = chicken;
            while(restCoupon>=10){
                newService = restCoupon/10;
                restCoupon = (restCoupon%10) + newService;
                service += newService;
            }
            answer = service;
        }else {
            answer = 0;
        }
        
        return answer;
    }
}