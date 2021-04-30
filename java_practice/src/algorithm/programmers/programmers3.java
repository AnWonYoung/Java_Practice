package algorithm.programmers;

public class programmers3 {
	public String[] solution(int n, int[]arr1, int[]arr2) {
		String[][] a = new String[n][n];
		String[][] b = new String[n][n];
//		String value = "";
		String[] answer = new String[n];
		a = Solution2(n, arr1, a);
		b = Solution2(n, arr2, b);
		
		for(int i=0; i<n; i++) {
			String value = "";
			for(int z=0; z<n; z++) {
				if(a[i][z].equals("0") && b[i][z].equals("0")) {
					value = value + "";
				} else if(a[i][z].equals("1") || b[i][z].equals("1")) {
					value = value + "#";
				}
				answer[i] = value;
			}
		}
		return answer;
	}
	

	public String[][] Solution2 (int n, int[]arr, String[][] c) {
//		String num = " ";
		for(int i=0; i<n; i++) {
			String num = Integer.toBinaryString(arr[i]); // 이진수
			if(num.length() < n) {				// 작으면 0을 추가해서 길이 맞추기
				while(num.length() < n) {
				num = "0" + num;
		}
			}
		
		String[] blank = num.split(""); // split 함수 배열로 반환 
		
		for(int z=0; z<n; z++) {
			c[i][z] = blank[z];
		}
		}
		return c;		
	}
	
	
	// 다른 방법
	class Solution3 {
	    public String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] answer = new String[n];
	        for(int i=0; i<n; i++) {
	            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
	        }
	        for(int i=0; i<n; i++) {
	            answer[i] = String.format("%" + n + "s", answer[i]);
	            answer[i] = answer[i].replaceAll("1", "#");
	            answer[i] = answer[i].replaceAll("0", " ");
	        }
	        return answer;
	    }
	}
}
