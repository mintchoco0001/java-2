package d0403;

public class Ex01 {

	public static void main(String[] args) {
//	배열안에 배열을 저장한다
		int[] stu1 = { 100, 100, 100 };
		int[] stu2 = { 100, 100, 100 };
		int[] stu3 = { 100, 100, 100 };
		int[] stu4 = { 100, 100, 100 };
		int[] stu5 = { 100, 100, 100 };

		int[][] allstu = { stu1, stu2, stu3, stu4, stu5 };
		System.out.println(allstu[0]);
		System.out.println(allstu[0][1]);// [0]번 배열의 1번값
		System.out.println(allstu.length);// 5
		System.out.println(allstu[0].length);// [0]번 배열의 값의 갯수를 표시
//		배열의 참조변수는 배열의 길이와 연관성이 없다.
		System.out.println(allstu[2].length);// 2

		// 3칸짜리 배열 5개 생성하는 이차원배열
		int[][] score = new int[5][3];

		// score의 0번 배열에 저장된 모든 값 출력
		// alt + shift + r 은 변수명 한번에 변경
		for (int 학생 = 0; 학생 < score.length; 학생++) {

			for (int 점수 = 0; 점수 < score[점수].length; 점수++) {
				System.out.println(score[학생][점수]);
			}
		}
	}

}
