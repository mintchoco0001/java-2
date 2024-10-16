package 메소드;

public class 피보나치수열 {

	public static void main(String[] args) {
		System.out.println(pibo(1));
	}
	public static int pibo(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}else {
			return pibo(n-2)+pibo(n-1);// 자기자신을 부르는 함수//재귀함수 라고 부른다.
		}
	}

}


