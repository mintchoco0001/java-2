package d0403;

public class Ex01 {

	public static void main(String[] args) {
//	�迭�ȿ� �迭�� �����Ѵ�
		int[] stu1 = { 100, 100, 100 };
		int[] stu2 = { 100, 100, 100 };
		int[] stu3 = { 100, 100, 100 };
		int[] stu4 = { 100, 100, 100 };
		int[] stu5 = { 100, 100, 100 };

		int[][] allstu = { stu1, stu2, stu3, stu4, stu5 };
		System.out.println(allstu[0]);
		System.out.println(allstu[0][1]);// [0]�� �迭�� 1����
		System.out.println(allstu.length);// 5
		System.out.println(allstu[0].length);// [0]�� �迭�� ���� ������ ǥ��
//		�迭�� ���������� �迭�� ���̿� �������� ����.
		System.out.println(allstu[2].length);// 2

		// 3ĭ¥�� �迭 5�� �����ϴ� �������迭
		int[][] score = new int[5][3];

		// score�� 0�� �迭�� ����� ��� �� ���
		// alt + shift + r �� ������ �ѹ��� ����
		for (int �л� = 0; �л� < score.length; �л�++) {

			for (int ���� = 0; ���� < score[����].length; ����++) {
				System.out.println(score[�л�][����]);
			}
		}
	}

}
