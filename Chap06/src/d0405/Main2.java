package d0405;

public class Main2 {

	public static void main(String[] args) {
		Maplevo m1 = new Maplevo("vŸ���Ŀ�����v", 
				8, 8, 4, 4, "��ī�Ͼ�");
		
		Maplevo m2 = new Maplevo("�����ǽ�vv",
				8, 8, 4, 4, "��ī�Ͼ�");
		
		Maplevo m3 = new Maplevo("�����°ű�����",
				6,5,8,4,"������ʹ�");
		
		
		System.out.println(m1.getEvry());
		
		Maplevo[] chars = {m1, m2, m3};
		for(int i=0; i<=2; i++) {
			if (true) {
				System.out.println(chars[i].getEvry());
			}
		}
	}

}
