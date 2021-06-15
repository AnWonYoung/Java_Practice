package algorithm.baekjoon;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int caseTest = scan.nextInt();
		int scoreArr[] = new int [1000];
		int score = 0;
		int sum = 0;
		
		for(int i=0; i<caseTest; i++) {
			int n = scan.nextInt();
			for(int z=0; z<n; z++) {
				scoreArr[z] = scan.nextInt();
				sum = sum + scoreArr[z];
			}
			double avg = sum / n;
			int c = 0;
			
			for(int z=0; z<n; z++) {
				if(scoreArr[z] > avg) {
					c++;
				}
			}
			System.out.printf("%.3f%", 100.0 * (c/n));
			System.out.println("%");
		}
	}

}
