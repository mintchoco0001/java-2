package d0409;

import java.util.ArrayList;
import java.util.Scanner;

public class Copy {

	public static void main(String[] args) {

		ArrayList<String> songs = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("=== MusicPlayer ===");
			System.out.println("[1]�߰� [2]���� [3]�˻� [4]��ü��ȸ");

			int choice = scan.nextInt();

			if (choice == 1) {
				System.out.println("�߰��մϴ�.");

				// 1. Scanner�� �뷡 ���� �Է¹޴´�.
				String title = scan.next();
				// 2. ArrayList�� �߰��Ѵ�.
				songs.add(title);

			} else if (choice == 2) {

				System.out.println("�����մϴ�.");
				for (int i = 0; i < songs.size(); i++) {
					System.out.println(i + 1 + "." + songs.get(i));
				}

				System.out.print("��ȣ >> ");
				int i = scan.nextInt();
				songs.remove(i - 1);

			} else if (choice == 3) {
				System.out.println("�˻��մϴ�.");

				String keyword = scan.next();

				boolean cnt = false;

				for (int i = 0; i < songs.size(); i++) {
					if (songs.get(i).contains(keyword)) {
						// songs�� i��° �뷡�� keyword�� ���ԵǾ� ������
						System.out.println(songs.get(i));
						cnt = true;
						// �� �뷡 ���!
					} // if��
				} // �˻� ��

				if (!cnt) {
					System.out.println("ã�� �� ����...");
				}

			} else if (choice == 4) {
				System.out.println("��ü��ȸ�մϴ�.");
				// 1. ArrayList�� ����� ���� ��� ���
				// 2. 0~������ ��ȣ���� 1���� �����ϸ鼭 ���
				for (int i = 0; i < songs.size(); i++) {
					System.out.println(i + 1 + "." + songs.get(i));
				}

			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			} // if��

		} // while ��

	}// main��

} // class ��