package programmers;

class Solution {
    public String solution(String s) {
        String answer = ""; // 문자 배열을 만들어서 자르기, 반복문 사용 > if문으로 짝수 / 홀수일 때를 정해서 대문자, 소문자 설정
        String[] sentence = s.split("");
        int length = sentence.length;
        int count = 0;

        for(int i=0; i<length; i++) {
            if(sentence[i].equals(" ")) {
                count = 0;
            }else if(count % 2 == 1) { // 홀수!
                sentence[i] = sentence[i].toLowerCase();
                count++;
            }else if (count % 2 == 0) {
                sentence[i] = sentence[i].toUpperCase();
                count ++;
            }
            answer = answer + sentence[i];

        }
        return answer;
    }
}
