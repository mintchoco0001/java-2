package d0409;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//주의사항!! 크래스 이름 ArrayList면 안됌!!!
		
		ArrayList<String> names = new ArrayList<String>();//String 타입을 지정하는 ArrayList 타입
		//Generic 타입 기본형X, 참조형O
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//int(기본형),Integer(참조형, Wrapper 클래스)
		//float => Float, double =>Double
		
		//1. 데이터 추가하기 - add 한번에 한개씩 저장가능
		names.add("아이유");
		names.add("카리나");
		names.add("윈터");
		names.add("장원영");
		
		//2.데이터 갯수 알아내기 = 배열 .length(필드), ArrayList.size() (메소드)
		System.out.println(names.size());
		//3.n번째 데이터 알아내기
		System.out.println(names.get(1));
		//4.n번째 데이터 삭제하기
		System.out.println(names.remove(1));
		System.out.println(names.get(1));
		//5.전체출력
		for(int i=0; i<names.size();i++) {
			System.out.println(names.get(i));
		}
	}

}
