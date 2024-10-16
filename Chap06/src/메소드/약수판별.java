package 메소드;

import java.util.Scanner;

public class 약수판별 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = sc.nextInt();
		System.out.println(mul(num, i));
	}

	public static String mul(int num, int i) {
		if (num % i == 0) {
			return "true";
		} else {
			return "false";
		}
	}
}
