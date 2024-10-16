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
			System.out.println("[1] �߰� [2] ���� [3] ��� [4] ����");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("�߰��մϴ�");

				System.out.print("���� >>");
				String title = sc.next();

				System.out.print("���� >>");
				String singer = sc.next();

				System.out.print("����ð� >>");
				int playTime = sc.nextInt();

				System.out.print("��� >>");
				String path = sc.next();

				Musicvo m = new Musicvo(title, singer, playTime, path);
				musics.add(m);

				break;

			case 2:
				System.out.println("�����մϴ�");
				for (int i = 0; i < musics.size(); i++) {
					System.out.println(i + 1 + "_" + musics.get(i));
				}

				int cnt = sc.nextInt();
				musics.remove(cnt - 1);

				System.out.println("�����Ϸ�");

				break;

			case 3:
				System.out.println("����մϴ�");
				for (int i = 0; i < musics.size(); i++) {
					System.out.println(i + 1 + "_" + musics.get(i));
				}

				int choice = sc.nextInt();
				String path2 = musics.get(choice - 1).getPath();// ���� get�� ����Ʈ�� ��ȣ ���� get�� ������ ���
				if (mp3.isPlaying()) {// ���� ������̸�
					mp3.play(path2);// ���߰� ���
				}

				mp3.play(path2);

				break;

			case 4:
				System.out.println("�����մϴ�");
				if (mp3.isPlaying()) {// ���� ������̸�
					mp3.stop();// �������
				}

				break;

			default:
				System.out.println("�߸��Է��ϼ˽��ϴ�.");
			}

		}

	}
}

//		�޼ҵ� �����ε� ���
//		=>���� �̸��� �޼ҵ带 2�� �̻� ������ �� �ִ� ���
//		=>����ڰ� �޼ҵ带 �ϳ��ϳ� �� ������� �ʾƵ� �����ϵ���
//		=>��, �Ű������� ������ Ÿ���� �޸��ؼ�!

//		println, add � �����ε� ������� ���� �޼ҵ�


//		static
//		==>��ü ������ ������� ��� Ŭ������ ���� ������ ����
//		==>non-static Area - ��ü���� �Ŀ� ����
//		==>static Area - ��ü���� X ���� (Ŭ���� �̸�.�ʵ�  �ɷ����̸�.�޼ҵ�())
//
//		System.out.println();
//		==>System ��ü �������� �ֳ�>?
//			�Ӥ�public static void main(String[] args)�� 
//			��  �̶� �����Ϸ��� main���� ��������� �Ǿ�����  ��


