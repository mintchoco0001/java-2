package d0401;

import java.util.Iterator;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
//		입력 받기
//		사용자-개발자-컴퓨터
//		입력 >사용자
//		입력 받는것>컴퓨터
//		시키는 사람>개발자
//		
//		1도구생성(Scanner)
//		Scanner sc = new Scanner(System.in);
//		생성한 도구의 주소  =    새로 생성할 도구
//		
//		2.입력명령
//		sc.next
//		도구 주소 .(에 있는) 기능, 도구

//		변수 
//		> 값을 저장하고 싶을때 사용
//		
//		생성(자료형을 붙임)
//		사용(자료형을 붙이지 않음)
//		int a= 10;
//		자료형
//		System.out.println(a);
//		사용형
//		System.out.println(int a);
//		문법적으로 불가능
//		
//		1. 생성하지 않은 변수 사용가능?
//		= 불가능. 생성할때는 사용보다 위에 작성
//		
//		2. 똑같은 이름으로 2개이상 생성가능?
//		= 불가능.

//		연산자 
//		> 연산결과 얻고 싶을때
//		
//		연산결과의 자료형
//		
//		true/false(boolean)
//		>비교, 논리
//		
//		숫자(int, double)
//		>산술
//		
//		결과없음
//		대입연산, 증감연산, 삼항연산
//		
//		조건문
//		
//		>연산결과(조건)에 따라서 다른 명령을 수행하기 위해 사용한다

//		반복문
//		
//		>특정 조건을 만족 할 때까지 명령을 반복
//		
//		반복이 끝날(계속 될) 조건
//		어디서부터 어디까지 반복 할지
//		
//		30만원 매출 달성할때까지(개발자가 몇번 반복할지 모를때)
//		>while
//		int i= 0;
//		while(i=<=100) {
//		실행1,
//		실행2,
//		실행3
//		i+=10;
//		}
//		10번 주문할때(개발자가 몇번 반복할지 알때)
//		>for
//		for(int i =0; i<=10; i++) {
//			
//		}
//		1. 도구생성
		Scanner sc= new Scanner(System.in);

		String id1 = "person1";
		String id2 = "person2";
		String id3 = "person3";
//		2.입력받기 (도구이름.next)
		String id4 = sc.nextLine();

//		id=sc.nextline();불가능
		
		
		if(id1 .equals(id4)) {
			System.out.println("중복입니다");
		}else if(id2 .equals(id4)) {
			System.out.println("중복입니다");
		}
		else if(id3 .equals(id4)) {
			System.out.println("중복입니다");
		}
		else {
			System.out.println("사용 가능합니다.");
		}
		
	}

}
