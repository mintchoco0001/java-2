package d0408;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		���ϸ����
//		�̸� �Ӽ�(�� �� ���� Ǯ) ����� mp lv
//		
//		1.�Ӽ� 5���� �����ϴ� �ڷ��� ����
//		2.���ϸ� 3���� ����
//		3.��� ���ϸ� ���� ���
//		
//		��ȭ) ��ī�� ã��

		Poketvo p1 = new Poketvo("��ī��", "����", "��", 10, 30);
		Poketvo p2 = new Poketvo("���̸�", "��", "��", 10, 30);
		Poketvo p3 = new Poketvo("���α�", "��", "�ٴ�", 10, 30);

		Poketvo[] p0 = { p1, p2, p3 };

		Scanner sc = new Scanner(System.in);

		String search = sc.nextLine();

		for (int i = 0; i < p0.length; i++) {
			if (p0[i].getName().equals(search)) {
				System.out.println(p0[i].getEvery());
			}
			if (!true) {
				System.out.println("ã���� ���� �����Դϴ�");
			}
		}
	}

}
