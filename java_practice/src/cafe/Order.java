package cafe;

import java.util.Scanner;

public class Order {
	int money;
	int choose;
	Scanner scan = new Scanner(System.in);
	Menu mi = new Menu();

	void order() {
		System.out.println("음료를 선택하세요 : ");
		while (true) {
			choose = scan.nextInt();
			if (choose < 0 || choose > mi.cafePriceArr.length) {
				System.out.println("없는 메뉴입니다. 다시 선택하세요.");
				continue;
			} else if (!(choose > mi.cafePriceArr.length)) {
				System.out.printf("%d번 메뉴를 선택하셨습니다.\n 돈을 투입하세요.", choose);
				money = scan.nextInt();
			}
			int priceIdx = choose - 1;
			if (money < mi.cafePriceArr[choose - 1]) {
				System.out.println("금액이 부족합니다. 다시 투입하세요.");
			} else if (money > mi.cafePriceArr[choose - 1]) {
				System.out.printf("감사합니다.");
				money = money - mi.cafePriceArr[priceIdx];
				System.out.printf("거스름 돈 %,d원 입니다.", money);
			}
		}
	}

}
