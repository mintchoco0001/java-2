package �޼ҵ�;

public class ������ã�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean ������(int a) {
		int sum = 1; //1�� ������ ������
		
		for(int i = 2; i<=a/2; i++) {// a�� 2�� ���� ������ ���� ���� ����� ����
			if(a %i == 0) //������
				sum+=i;//sum�� ����
			}
		
		return sum == a;//sum�� a�� ������
	}

}
