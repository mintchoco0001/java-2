package �޼ҵ�;

public class �Ҽ�ã�� {
	public static void main(String[] args) {

	}

	public static boolean �Ҽ�(int a) {
		for (int i = 2; i <= a / 2; i++) {// a�� 2�� ���� ������ ���� ���� ��� ����
			if (a % i == 0) {//�ѹ��̶� �������� �Ҽ� �ƴ�
				return false;
			}
		}
		return true; //�ݺ��� �������� if���� ������ �������ٸ� �Ҽ���
	}
}
