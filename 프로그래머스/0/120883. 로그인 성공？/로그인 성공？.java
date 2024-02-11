class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = ""; 
        
        for(int i=0; i<db.length; i++) {
            if(id_pw[0].equals(db[i][0])) { // 아이디가 일치하는 경우
                if(id_pw[1].equals(db[i][1])) { // 비밀번호도 일치하는 경우
                    answer = "login";
                    break; 
                } else { // 비밀번호가 일치하지 않는 경우
                    answer = "wrong pw";
                    break; 
                }
            }else {
                answer = "fail";
            }
        }
        
        return answer;
    }
}
