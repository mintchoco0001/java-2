package d0409;

import java.util.ArrayList;
import java.util.Scanner;

public class SongList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> songList = new ArrayList<String>();
		System.out.println(songList.size());
		while (true) {

			System.out.println("=== Music Player ===");
			System.out.println("[1]추가 [2]삭제 [3]검색 [4] 전체조회");
			System.out.print(">>");

			int a = sc.nextInt();
			if (a == 1) {
				System.out.println("추가합니다");
				String b = sc.next();
				songList.add(b);
			} else if (a == 2) {
				System.out.println("삭제합니다");
				for (int i = 0; i < songList.size(); i++) {
					System.out.println(i + 1 + "." + songList.get(i));
				}
				System.out.print("번호 >> ");
				int i = sc.nextInt();
				songList.remove(i - 1);
//				String b = sc.next();
//				for (int i = 0; i < songList.size(); i++) {
//					if (b.equals(songList.get(i))) {
//						
//						songList.remove(songList.get(i));
//					}
//				}
				for (int j = 0; j < songList.size(); j++) {
					System.out.println(j + 1 + "." + songList.get(j));
				}
			} else if (a == 3) {
				System.out.println("검색합니다");
				String b = sc.next();
				boolean cnt = false;
				for (int i = 0; i < songList.size(); i++) {
//				for(int i = 0; i<songList.size(); i++) {
//			       if (songList.get(i).contains(keyword)) {
//			       // songs의 i번째 노래에 keyword가 포함되어 있으면
//			         System.out.println(songList.get(i));
//			         cnt = true;
//			          // 그 노래 출력!
//			          } // if끝
//			      } // 검색 끝
//			            
					if (b.equals(songList.get(i))) {
						System.out.println(songList.get(i) + "은/는 " + i + "번째 트랙에 있습니다");

					}
				}
				if (!cnt) {
					System.out.println("찾을 수 없음");
				}
			} else if (a == 4) {
				System.out.println("전체조회합니다");
				for (int i = 0; i < songList.size(); i++) {
					System.out.println(i + 1 + "_" + songList.get(i));
				}
			} else {
				System.out.println("잘못입력하셨습니다");
			} // if끝

		} // 와일끝

	}

}
