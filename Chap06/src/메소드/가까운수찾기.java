package 메소드;

public class 가까운수찾기 {

	public static void main(String[] args) {
		
	}
	public static int close(int a, int b) {
		int 거리= a>10?a-10:10-a;
		int 거리2= b>10?b-10:10-b;
		
		if(거리<거리2) {
			return a;
		}else {
			return b;
		}
		
	}

}
