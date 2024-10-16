package d0408;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		포켓몬생성
//		이름 속성(불 물 전기 풀) 출몰지 mp lv
//		
//		1.속성 5가지 저장하는 자료형 설계
//		2.포켓몬 3마리 생성
//		3.모든 포켓몬 정보 출력
//		
//		심화) 피카츄 찾기

		Poketvo p1 = new Poketvo("피카츄", "전기", "숲", 10, 30);
		Poketvo p2 = new Poketvo("파이리", "불", "산", 10, 30);
		Poketvo p3 = new Poketvo("꼬부기", "물", "바다", 10, 30);

		Poketvo[] p0 = { p1, p2, p3 };

		Scanner sc = new Scanner(System.in);

		String search = sc.nextLine();

		for (int i = 0; i < p0.length; i++) {
			if (p0[i].getName().equals(search)) {
				System.out.println(p0[i].getEvery());
			}
			if (!true) {
				System.out.println("찾을수 없는 정보입니다");
			}
		}
	}

}
