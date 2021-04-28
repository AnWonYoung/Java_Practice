package algorithm.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class programmers1 {

}

class Solution {
    public int[] solution(int[] numbers) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    	int[] answer;
    	for(int i=0; i<numbers.length; i++) {
    		for(int z=i+1; z<numbers.length; z++) {
    			int num = numbers[i] + numbers[z];
    			if(list.indexOf(num) < 0) {	// 음수로 반환, -1이 된다는 건 곧 값이 없다는 것
    				list.add(num);			// 따라서 add로 num에 값을 추가
    			}
    		}
    	}        
    	answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        Arrays.sort(answer); // 오름차순 정렬
        return answer;
    }
}