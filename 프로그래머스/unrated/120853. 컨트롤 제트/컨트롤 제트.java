import java.util.*;

class Solution {
    public int solution(String s) {
        
        //스택을 이용해보기
        //우선 공백으로 문자열을 나눈 뒤 형변환해 스택에 저장한다.
        //저장하다가 Z를 만나면 pop을 해서 최상단의 숫자를 뺀다.
        //스택에 있는 정수들을 더해서 반환한다.
        
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(String x : s.split(" ")){
            if(x.equals("Z")){
                stack.pop();
            }else {
                stack.push(Integer.parseInt(x));
            }
        }
        
        for(int i : stack){
            answer += i;
        }
        
        return answer;
    }
}