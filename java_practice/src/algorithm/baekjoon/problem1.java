package algorithm.baekjoon;

import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int plus_n = n;
		int length = 0;

		while (true) {
			int a = n%10;
			int b = n/10;
			
			n = ((a)*10)+(((b)+(a))%10);
			length++;
			
			if(plus_n == n) {
				break;
			}
		}
		System.out.println("사이클의 길이 : " + length);
	}

}
