package d0402;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// ū�� ã��

		// ������
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� �̸� >");
		String name = sc.nextLine();
//		���۷��� ������ Ÿ���� �޸��� Ÿ�԰� �����ϰ�
		String[] names = { "������", "ī����", "����", "�����", "������" };
		boolean is = false;
//		ã�� ��ã�� ���ϴ� ������� �ΰ��̴� �������� �ϳ� ����

//���� ��� java.lang.ArrayIndexOutOfBoundsException : �迭 �ε��� ���� ���
		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				System.out.println(name + "�� " + i + "�� �ε����� �ֽ��ϴ�!");
				is = true;
			}
			if (!is) {// is�� false��� !(not) �������� true�� �ٲ�
				System.out.println("��ã�Ҵ�");
			}
		}
//		�迭�� ����ϴ� ����
//		1. �ѹ��� ���� �ڷ��� ��뷮���� ����
//		2. ������ ���� �����Ϳ� ������ �ű�� ���� ���
//		==> Ž������, ���İ���, �ݺ��� ��� ����
	}

}
