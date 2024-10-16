package d0405;
//Main 클래스
public class Main {

	public static void main(String[] args) {

		//main메소드가 포함된 클래스 => Main클래스
		
		//초보가 처음부터 객체지향 설계법을 사용하는것은 매우 어려운 일이다
		//오늘의 목표 : 클래스와 객체 구분하기
		//객체 ) 클래스를 새로운 자료형으로 활용 할 수 있음 => valueObject (vo)
		
		//메이플 캐릭터 생성한다고 했을때
		String nick = "zi존법사";
		int str = 4;
		int dex = 5;
		int luck = 6;
		int intel = 8;
		String surver = "카스티아";
		
		String nick2 = "zi존법사";
		int str2 = 4;
		int dex2 = 5;
		int luck2 = 6;
		int intel2 = 8;
		String surver2 = "카스티아";

//		이런시의 여러번 코딩을 하기는 매우 힘든일
//		그래서 새로운 유형의 자료형이 필요함
		
		//메모리 할당 (객체생성)
//		Maplevo m1 = new Maplevo();
//		
//		m1.nick = "v타락파워전사v";
//		m1.str=8;
//		m1.dex=6;
//		m1.intel=4;
//		m1.luck=4;
//		m1.surver="스카니아";
//		
//		Maplevo m2 = new Maplevo();
//		m2.nick="번개의신vv";
//		m2.str=8;
//		m2.dex=8;
//		m2.intel=4;
//		m2.luck=6;
//		m2.surver="스카니아";
////		
//		Maplevo[] chars = {m1, m2};
//		
//		
//		한번 지정된 것은 함부로 바꾸면 안됌 *캡슐화에 위배됨
//		객체지정할때 딱 한번 지정하면 더이상 바꿀 수 없게
//		=>생성자메소드 (따로 호출불가능=>객체생성할때 같이 호출됨)

	Maplevo m3= new Maplevo("",1,2,3,4,"");
//	객체를 생성할 때 생성자가 호출이 되는데
//	생성자에 매개변수가 있으니 개수와 타입을 맞춰서 지정한다.
//	--> 반드시 초기화해야하는 필드는 생성자로 초기화한다.
	
	}

}
