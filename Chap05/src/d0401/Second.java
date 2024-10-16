package d0401;

public class Second {

	public static void main(String[] args) {
		// String 3칸 배열생성
		String[] names = new String[3];
		// int 라면 int[] ?? = new int[];
		// names에 저장된 값 출력하기
		System.out.println(names);
		// 값저장 vs 주소저장
		// names 배열의 0번칸에 아이유 이름 저장해라
		names[0] = "아일유";
		names[1] = "아이유";
		names[2] = "아삼유";
		
		//names 배열의 0번칸에 저장된 값 출력
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		//0~2번칸 다 출력해보기
		for(int i=2; i>=0; i--) {
			System.out.println(names[i]);
		}
		String foods[] = {"참치","오돌뼈","아구찜"}; 
		String drinks[]= {"소맥","듀","메이커스","발렌타인"};
		System.out.println(foods);
		System.out.println(drinks);
		
		foods = drinks;
		
//		값이 변동되는것이 아닌 주소가 바뀌는 개념
		System.out.println(foods);
		System.out.println(drinks);
//		이미 foods의 주소는 drinks의 주소로 대입되어 원래의 주소는 소멸함
		
	}

}
