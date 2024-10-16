package d0405;

public class Main2 {

	public static void main(String[] args) {
		Maplevo m1 = new Maplevo("v타락파워전사v", 
				8, 8, 4, 4, "스카니아");
		
		Maplevo m2 = new Maplevo("번개의신vv",
				8, 8, 4, 4, "스카니아");
		
		Maplevo m3 = new Maplevo("닉짓는거귀찮음",
				6,5,8,4,"집가고싶다");
		
		
		System.out.println(m1.getEvry());
		
		Maplevo[] chars = {m1, m2, m3};
		for(int i=0; i<=2; i++) {
			if (true) {
				System.out.println(chars[i].getEvry());
			}
		}
	}

}
