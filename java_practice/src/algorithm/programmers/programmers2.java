package algorithm.programmers;

public class programmers2 {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
 
        int a = 0;
        int b = 0;
        
        
        for(int i=0; i<lost.length; i++) {
        	for(int z=0; z<reserve.length; z++) {
        		if(lost[i] == reserve[z]) {
        			b++;
        			reserve[z] = -1;
        			lost[i] = -1;
        			break;
        		}
        	}
        }
        for(int i=0; i<lost.length; i++) {
        	for(int z=0; z<reserve.length; z++) {
        		if(lost[i] == reserve[z]-1 || lost[i] == reserve[z]+1) {
        			a++;
        			reserve[z] = -1; // 빌려주고 없음
        			break;
        		}
        	}
        }
        
        answer = a + b + (n-lost.length);
        
        return answer;
    }
}
