package d0401;

public class Second {

	public static void main(String[] args) {
		// String 3ĭ �迭����
		String[] names = new String[3];
		// int ��� int[] ?? = new int[];
		// names�� ����� �� ����ϱ�
		System.out.println(names);
		// ������ vs �ּ�����
		// names �迭�� 0��ĭ�� ������ �̸� �����ض�
		names[0] = "������";
		names[1] = "������";
		names[2] = "�ƻ���";
		
		//names �迭�� 0��ĭ�� ����� �� ���
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		//0~2��ĭ �� ����غ���
		for(int i=2; i>=0; i--) {
			System.out.println(names[i]);
		}
		String foods[] = {"��ġ","������","�Ʊ���"}; 
		String drinks[]= {"�Ҹ�","��","����Ŀ��","�߷�Ÿ��"};
		System.out.println(foods);
		System.out.println(drinks);
		
		foods = drinks;
		
//		���� �����Ǵ°��� �ƴ� �ּҰ� �ٲ�� ����
		System.out.println(foods);
		System.out.println(drinks);
//		�̹� foods�� �ּҴ� drinks�� �ּҷ� ���ԵǾ� ������ �ּҴ� �Ҹ���
		
	}

}
