package 메소드;

import java.util.Scanner;

public class 큰수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(num(a,b));
	}

	public static int num (int a, int b) {
		if(a>b) {
			return a;//if문 안에서는 참일때만 리턴하기 때문에 경우의 수를 모두 설정해줘야 리턴한다
		}else if (a<b) {
			return b;
		}else {
			return 0;
		}
		
	}

}
