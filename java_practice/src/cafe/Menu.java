package cafe;

import java.util.Scanner;

public class Menu {
	MenuArr[] arr = new MenuArr[5];
	String[] cafeMenuArr = { "아메리카노", "녹차라떼", "자몽에이드", "레몬에이드", "아인슈페너" };
	int[] cafePriceArr = { 4000, 5000, 5500, 5500, 6000 };
	Scanner scan = new Scanner(System.in);

	void show() {
		for (int i = 0; i < arr.length; i++) {
			MenuArr m1 = new MenuArr();
			m1.cafeMenu = cafeMenuArr[i];
			m1.cafePrice = cafePriceArr[i];
			arr[i] = m1;
		}

		String str = "메뉴판\n";
		for (int i = 0; i < arr.length; i++) {
			str += String.format("%d. %s = %,d원\n", i + 1, arr[i].cafeMenu, arr[i].cafePrice);
		}
		System.out.println(str);

	}
}
