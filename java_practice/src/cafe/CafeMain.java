package cafe;

import java.util.Scanner;

public class CafeMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String order = "주문하시겠습니까? (y/n)";
		System.out.println(order);
		order=scan.next();
		if(order.equals("y")) {
			Menu m1 = new Menu(); // 메뉴판 보여주는 메소드
			m1.show();
			Order ord = new Order(); // 음료 주문 및 계산하는 메소드
		    ord.order();
		} else {
			System.out.println("안녕히가세요");
		}
		
	}

}
