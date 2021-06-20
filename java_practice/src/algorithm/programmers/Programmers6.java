package algorithm.programmers;

import java.util.Arrays;

public class Programmers6 {
  public int solution(int[] d, int budget) {
	int answer = 0;
	Arrays.sort(d);
	int Department = 0;
	for (int i = 0; i < d.length; i++) {
		Department = Department + d[i];
		if (Department <= budget) {
			answer = d.length;
		} else if (Department > budget) {
			answer = i;
			break;
		}
	}
	return answer;
	}
}
