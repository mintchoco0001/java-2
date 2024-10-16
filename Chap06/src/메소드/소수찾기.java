package 메소드;

public class 소수찾기 {
	public static void main(String[] args) {

	}

	public static boolean 소수(int a) {
		for (int i = 2; i <= a / 2; i++) {// a를 2로 나눈 나머지 보다 작은 약수 없음
			if (a % i == 0) {//한번이라도 나눠지면 소수 아님
				return false;
			}
		}
		return true; //반복이 끝났을때 if문속 리턴을 못만났다면 소수임
	}
}
