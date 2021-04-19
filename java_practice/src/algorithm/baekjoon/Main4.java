package algorithm.baekjoon;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// 배열 생성, 첫번째, 마지막 카드 선언
		int arr[] = new int[n*2];
		int firstIdx = 1;
		int lastIdx = n;
		// 반복 두 번 돌리기
		// 배열을 담는 for문
		for(int i=1; i <= n; i++) {
			arr[i] = i;
		}
		// 카드 출력하는 while문
		while (n-- > 1) {
			firstIdx ++;
			arr[lastIdx + 1] = arr[firstIdx];
			lastIdx++;
			firstIdx++;
		}
		System.out.println(arr[firstIdx]);
 }

}
