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
			System.out.println("[1]�߰� [2]���� [3]�˻� [4] ��ü��ȸ");
			System.out.print(">>");

			int a = sc.nextInt();
			if (a == 1) {
				System.out.println("�߰��մϴ�");
				String b = sc.next();
				songList.add(b);
			} else if (a == 2) {
				System.out.println("�����մϴ�");
				for (int i = 0; i < songList.size(); i++) {
					System.out.println(i + 1 + "." + songList.get(i));
				}
				System.out.print("��ȣ >> ");
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
				System.out.println("�˻��մϴ�");
				String b = sc.next();
				boolean cnt = false;
				for (int i = 0; i < songList.size(); i++) {
//				for(int i = 0; i<songList.size(); i++) {
//			       if (songList.get(i).contains(keyword)) {
//			       // songs�� i��° �뷡�� keyword�� ���ԵǾ� ������
//			         System.out.println(songList.get(i));
//			         cnt = true;
//			          // �� �뷡 ���!
//			          } // if��
//			      } // �˻� ��
//			            
					if (b.equals(songList.get(i))) {
						System.out.println(songList.get(i) + "��/�� " + i + "��° Ʈ���� �ֽ��ϴ�");

					}
				}
				if (!cnt) {
					System.out.println("ã�� �� ����");
				}
			} else if (a == 4) {
				System.out.println("��ü��ȸ�մϴ�");
				for (int i = 0; i < songList.size(); i++) {
					System.out.println(i + 1 + "_" + songList.get(i));
				}
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
			} // if��

		} // ���ϳ�

	}

}
