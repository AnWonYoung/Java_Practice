package algorithm.programmers;

class Solution {
	public String solution(String s, int n) {
		String answer = "";
		char ch = 0;
		
		for(int k=0; k<s.length(); k++) { // 문자열 길이 만큼 반복돌리기
			ch = s.charAt(k);
		
		if(ch >= 'A' && ch <= 'Z') {	// 대문자 케이스 잡아주기
			if(ch + n > 'Z') {
				answer += (char)(ch + n-26);
			}else {
				answer += (char)(ch + n);
			}
		} else if(ch >='a' && ch <= 'z') {	// 소문자 케이스 잡아주기
			if(ch + n > 'z') {
				answer += (char)(ch + n-26);
			}else {
				answer += (char)(ch + n); 	// 공백을 안 잡았으니 else로 다시 걸러주기
			}
		} else {
            answer += (char)(ch);
        }
	}
		return answer;
	}
}
