package d0402;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {

//		new�� �޸�(���,����)�� �����ϴ� Ű����
//		�迭 �ּҸ� �����ϴ� ������ ���۷���(������)������� �Ѵ�
//		�����ϰ���� ����Ÿ��[] n = new ����Ÿ��[]
//		��) int[] a = new int[];\
		// �迭 10�� �ѹ��� ����ϱ�
//		int[] a = { 13, 5, 7, 17, 3, 16, 19, 20, 2, 1 };
//		for (int i = 0; i < 10; i++) {
//			System.out.println(a[i]);
//		}
		int[] array = new int[10];// 0~9
//		new> �޸� �����ϴ� Ű����
//		new ���� ���°�?> �޸� ����
//		�޸� �����ϸ� �ּҰ� �ο�!
//		�ּҸ� �����س��� ���߿� ã�ư��� ����
//		������ �� ���°�>����
//		������ �����ε� �ּҸ� ����> ���۷���(������)����
//		���۷��� ������ Ÿ���� �޸��� ���¿� �����ϰ�

//		�迭 ���� �� ���� �ʱ�ȭ ���� ������ int =>0, String =>null�� �迭�� �����

//		int[] array2;
//		array2[2] = 5;
//		������ ������ �迭�������� �ʾƼ�.
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < array.length; i++) {

			array[i] = new Random().nextInt(10);
			
			// �迭���� Ȧ���� ����ϴ� ���ǹ�
			if (array[i] % 2 == 1) {
				sum=array[i];
				System.out.print(sum+" ");
				sum1++;
			}
			
			// ������ 10��
//			System.out.println(array[i]);
			// �迭 ��� �ڸ� ��
//			sum+= array[i];
//			System.out.println(sum);

		}System.out.println(sum1+"��");

		// ���
//		System.out.println("��� : "+((double)sum/array.length));
		// 4��°�ڸ��� 9��°�ڸ� ��
//		sum = array[3] + array[8];
//		System.out.println(sum);
//		
		// for each��(Ȯ�� for��)
//		for(int temp : array) {
//			System.out.println(temp);
//		}

	}
}