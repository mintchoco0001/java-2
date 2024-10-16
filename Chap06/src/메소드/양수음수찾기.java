package 메소드;
import java.util.Scanner;


public class 양수음수찾기 {

	public static void main(String[] args) {
	System.out.println(num(0));		
	}
	
	public static String num (int a) {
		
		if(a>0) {
			return "양수입니다";
		}else if(a<0){
			return "음수입니다";
		}else {
			return "zero입니다";
		}
	}

}
