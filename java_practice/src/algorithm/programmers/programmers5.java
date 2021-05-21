package algorithm.programmers;

class programmers5 {
	
    public String solution(int n) {
        String answer = "";
        int num = 0;
        
        while(n>0) {
            num = n%3;
            n = n/3;
            
            if(num == 0) {
                n = n-1 ;
                num = 4;
            }
            
            answer = num + answer;
        }
        
        return answer;
    }
    
//    -----------------------------------------------------------------------------
    
    class Solution {
        public String solution(int n) {
            String answer = "";
            int num = 1;
            
            while(n > 0) {
                num = n%3;
                answer = (num == 0) ? "4" + answer : (num == 2) ? "2" + answer : "1" + answer;
                
                n = n/3;
                
                if(num == 0) {
                    n = n-1;
                }
            }
            
            return answer;
        }
    }
}
