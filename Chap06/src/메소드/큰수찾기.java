package �޼ҵ�;

import java.util.Scanner;

public class ū��ã�� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(num(a,b));
	}

	public static int num (int a, int b) {
		if(a>b) {
			return a;//if�� �ȿ����� ���϶��� �����ϱ� ������ ����� ���� ��� ��������� �����Ѵ�
		}else if (a<b) {
			return b;
		}else {
			return 0;
		}
		
	}

}
