package d0402;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// 큰수 찾기

		// 총정리
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 >");
		String name = sc.nextLine();
//		레퍼런스 변수의 타입은 메모리의 타입과 동일하게
		String[] names = { "아이유", "카리나", "윈터", "장원영", "안유진" };
		boolean is = false;
//		찾냐 못찾냐 원하는 결과값이 두개이니 논리변수를 하나 생성

//예외 경고문 java.lang.ArrayIndexOutOfBoundsException : 배열 인덱스 범위 벗어남
		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				System.out.println(name + "는 " + i + "번 인덱스에 있습니다!");
				is = true;
			}
			if (!is) {// is가 false라면 !(not) 연산으로 true로 바뀜
				System.out.println("못찾았다");
			}
		}
//		배열을 사용하는 이유
//		1. 한번에 같은 자료형 대용량으로 생성
//		2. 순서가 없는 데이터에 순서를 매기기 위해 사용
//		==> 탐색용이, 정렬가능, 반복문 사용 가능
	}

}
