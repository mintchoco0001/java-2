package d0402;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {

//		new는 메모리(기능,도구)를 생성하는 키워드
//		배열 주소를 저장하는 변수는 레퍼런스(참조형)변수라고 한다
//		저장하고싶은 변수타입[] n = new 변수타임[]
//		예) int[] a = new int[];\
		// 배열 10개 한번에 출력하기
//		int[] a = { 13, 5, 7, 17, 3, 16, 19, 20, 2, 1 };
//		for (int i = 0; i < 10; i++) {
//			System.out.println(a[i]);
//		}
		int[] array = new int[10];// 0~9
//		new> 메모리 생성하는 키워드
//		new 옆에 적는거?> 메모리 형태
//		메모리 생성하면 주소가 부여!
//		주소를 저장해놔야 나중에 찾아갈수 있음
//		저장할 때 쓰는것>변수
//		변수긴 변수인데 주소를 저장> 레퍼런스(참조형)변수
//		레퍼런스 변수의 타입은 메모리의 형태와 동일하게

//		배열 생성 후 값을 초기화 하지 않으면 int =>0, String =>null로 배열이 저장됌

//		int[] array2;
//		array2[2] = 5;
//		에러의 이유는 배열설정하지 않아서.
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < array.length; i++) {

			array[i] = new Random().nextInt(10);
			
			// 배열값의 홀수만 출력하는 조건문
			if (array[i] % 2 == 1) {
				sum=array[i];
				System.out.print(sum+" ");
				sum1++;
			}
			
			// 랜덤값 10개
//			System.out.println(array[i]);
			// 배열 모든 자리 합
//			sum+= array[i];
//			System.out.println(sum);

		}System.out.println(sum1+"개");

		// 평균
//		System.out.println("평균 : "+((double)sum/array.length));
		// 4번째자리와 9번째자리 합
//		sum = array[3] + array[8];
//		System.out.println(sum);
//		
		// for each문(확장 for문)
//		for(int temp : array) {
//			System.out.println(temp);
//		}

	}
}