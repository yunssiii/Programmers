class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int num1 = hp/5; //장군개미의 수
        int num2 = (hp%5)/3; //병정개미의 수
        int num3 = (hp%5)%3;
        
        answer = num1+num2+num3;

        return answer;
    }
}