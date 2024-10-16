package d0411;

import java.util.ArrayList;
import java.util.Scanner;
import javazoom.jl.player.MP3Player;

public class Musiclist {

	public static void main(String[] args) {
		ArrayList<Musicvo> musics = new ArrayList<Musicvo>();
		Scanner sc = new Scanner(System.in);
		MP3Player mp3 = new MP3Player();

		while (true) {
			System.out.println("[1] 추가 [2] 삭제 [3] 재생 [4] 정지");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("추가합니다");

				System.out.print("제목 >>");
				String title = sc.next();

				System.out.print("가수 >>");
				String singer = sc.next();

				System.out.print("재생시간 >>");
				int playTime = sc.nextInt();

				System.out.print("경로 >>");
				String path = sc.next();

				Musicvo m = new Musicvo(title, singer, playTime, path);
				musics.add(m);

				break;

			case 2:
				System.out.println("삭제합니다");
				for (int i = 0; i < musics.size(); i++) {
					System.out.println(i + 1 + "_" + musics.get(i));
				}

				int cnt = sc.nextInt();
				musics.remove(cnt - 1);

				System.out.println("삭제완료");

				break;

			case 3:
				System.out.println("재생합니다");
				for (int i = 0; i < musics.size(); i++) {
					System.out.println(i + 1 + "_" + musics.get(i));
				}

				int choice = sc.nextInt();
				String path2 = musics.get(choice - 1).getPath();// 앞의 get은 리스트의 번호 뒤의 get은 파일의 경로
				if (mp3.isPlaying()) {// 만약 재생중이면
					mp3.play(path2);// 멈추고 재생
				}

				mp3.play(path2);

				break;

			case 4:
				System.out.println("정지합니다");
				if (mp3.isPlaying()) {// 만약 재생중이면
					mp3.stop();// 재생중지
				}

				break;

			default:
				System.out.println("잘못입력하셧습니다.");
			}

		}

	}
}

//		메소드 오버로딩 기법
//		=>같은 이름의 메소드를 2개 이상 설계할 수 있는 기법
//		=>사용자가 메소드를 하나하나 다 기억하지 않아도 가능하도록
//		=>단, 매개변수의 갯수나 타입을 달리해서!

//		println, add 등도 오버로딩 기법으로 만든 메소드


//		static
//		==>객체 생성과 상관없이 모든 클래스가 접근 가능한 공간
//		==>non-static Area - 객체생성 후에 접근
//		==>static Area - 객체생성 X 접근 (클래스 이름.필드  믈래스이름.메소드())
//
//		System.out.println();
//		==>System 객체 생성한적 있나>?
//			ㅣㅡpublic static void main(String[] args)ㄱ 
//			ㄴ  이때 컴파일러가 main에서 가져오기로 되어있음  ㅢ


