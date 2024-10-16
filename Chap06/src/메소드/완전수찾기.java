package 메소드;

public class 완전수찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean 완전수(int a) {
		int sum = 1; //1은 무조건 완전수
		
		for(int i = 2; i<=a/2; i++) {// a를 2로 나눈 나머지 보다 작은 약수는 없다
			if(a %i == 0) //약수라면
				sum+=i;//sum에 누적
			}
		
		return sum == a;//sum과 a가 같으면
	}

}
