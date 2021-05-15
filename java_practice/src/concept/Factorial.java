package concept;

public class Factorial {
	public static void main(String[] args) {
		int input = 4;
		
		System.out.println(fact(input));
	}
	
	public static int fact(int n) {
		if(n <= 1) {
			return n;
		} else {
			return fact(n-1) * n;
		}
	}
	
	//fact(4) 호출을 시작으로 사라지지 않고 stack에 쌓임
	//fact(2)까지 쌓였다가 1이 되었을 때 return n으로 종료
	//결과 = 4*3*2*1 = 4! 
}
