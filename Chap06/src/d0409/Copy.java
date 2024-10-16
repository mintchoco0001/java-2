package d0409;

import java.util.ArrayList;
import java.util.Scanner;

public class Copy {

	public static void main(String[] args) {

		ArrayList<String> songs = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("=== MusicPlayer ===");
			System.out.println("[1]추가 [2]삭제 [3]검색 [4]전체조회");

			int choice = scan.nextInt();

			if (choice == 1) {
				System.out.println("추가합니다.");

				// 1. Scanner로 노래 제목 입력받는다.
				String title = scan.next();
				// 2. ArrayList에 추가한다.
				songs.add(title);

			} else if (choice == 2) {

				System.out.println("삭제합니다.");
				for (int i = 0; i < songs.size(); i++) {
					System.out.println(i + 1 + "." + songs.get(i));
				}

				System.out.print("번호 >> ");
				int i = scan.nextInt();
				songs.remove(i - 1);

			} else if (choice == 3) {
				System.out.println("검색합니다.");

				String keyword = scan.next();

				boolean cnt = false;

				for (int i = 0; i < songs.size(); i++) {
					if (songs.get(i).contains(keyword)) {
						// songs의 i번째 노래에 keyword가 포함되어 있으면
						System.out.println(songs.get(i));
						cnt = true;
						// 그 노래 출력!
					} // if끝
				} // 검색 끝

				if (!cnt) {
					System.out.println("찾은 적 없음...");
				}

			} else if (choice == 4) {
				System.out.println("전체조회합니다.");
				// 1. ArrayList에 저장된 정보 모두 출력
				// 2. 0~마지막 번호까지 1개씩 증가하면서 출력
				for (int i = 0; i < songs.size(); i++) {
					System.out.println(i + 1 + "." + songs.get(i));
				}

			} else {
				System.out.println("잘못입력하셨습니다.");
			} // if끝

		} // while 끝

	}// main끝

} // class 끝