package algorithm.baekjoon;

import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if (num % 4 == 0) {
			if(num % 400 == 0 || num % 100 != 0) {
				System.out.println(1);
			}else {
			System.out.println(0);
		} 
		} else {
			System.out.println(0);
		}
	}

}


// 컴파일 에러로 다른 답 복붙
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		int y = in.nextInt();
//		in.close();
//       
//		if(y%4==0) {
//			if(y%400==0) System.out.println("1");
//			else if(y%100==0) System.out.println("0");
//			else System.out.println("1");
//		}
//		else System.out.println("0");
//	}
//}

