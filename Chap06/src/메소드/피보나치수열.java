package �޼ҵ�;

public class �Ǻ���ġ���� {

	public static void main(String[] args) {
		System.out.println(pibo(1));
	}
	public static int pibo(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}else {
			return pibo(n-2)+pibo(n-1);// �ڱ��ڽ��� �θ��� �Լ�//����Լ� ��� �θ���.
		}
	}

}


